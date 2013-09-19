import java.util.*;

public class Main {

  public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        String words[] = {"hello","world","java","code","example","hello","java","java"};
        HashMap< String,Integer > map = new HashMap< String , Integer >();
        
        for(String s : words ){
            if( map.containsKey(s) ){
                 map.put(s, map.get(s) + 1 );
            }
            else {
                map.put(s, 1);
            }
        }
         
        for (String KEY : map.keySet()) {
            System.out.println( KEY + " -> " + map.get( KEY ) );
        }

    }
}
