import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

class HttpGetAPI {

  static final String API_ENDPOINT = "https://soda.demo.socrata.com/resource/earthquakes.json";

  public static void main(String args[]) {

    int LIMIT = 10;
    int MAX_LIMIT = 100;
    List<String> urls = new ArrayList<>();
    int offset = 0;
    while (offset < MAX_LIMIT) {
      urls.add(String.format("%s?$limit=%s&$offset=%d", API_ENDPOINT, LIMIT, offset));
      offset += LIMIT;
    }
    List<Response> contents = HttpClient.getAll(urls);
    System.out.println(contents);
  }
}


class HttpClient {

  public static List<Response> getAll(List<String> urls) {
    ExecutorService executor = Executors.newFixedThreadPool(Math.min(urls.size(), 10));
    List<CompletableFuture<Response>> futures =
        urls.stream().map(url -> CompletableFuture.supplyAsync(() -> get(url), executor))
            .collect(Collectors.toList());
    List<Response> result =
        futures.stream().map(CompletableFuture::join).collect(Collectors.toList());
    executor.shutdown();
    return result;
  }

  public static Response get(String url) {
    int statusCode = HttpURLConnection.HTTP_INTERNAL_ERROR;
    try {

      URL obj = new URL(url);
      HttpURLConnection con = (HttpURLConnection) obj.openConnection();
      con.setRequestMethod("GET");

      statusCode = con.getResponseCode();
      System.out.println("\nSending 'GET' request to URL : " + url);

      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();

      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }
      in.close();
      return new Response(url, statusCode, response.toString());
    } catch (Exception ex) {
      System.err.println(ex.getMessage());
      return new Response(url, statusCode, ex.getMessage());
    }

  }
}


class Response {

  String url;
  int statusCode;
  String response;

  public Response(String url, String response) {
    super();
    this.url = url;
    this.response = response;
  }

  public Response(String url, int statusCode, String response) {
    super();
    this.url = url;
    this.statusCode = statusCode;
    this.response = response;
  }

  @Override
  public String toString() {
    return String.format("{\"url\": \"%s\",\n\"status_code\": \"%s\",\n\"response\": '%s\"}\n", url,
        statusCode, response);
  }



}
