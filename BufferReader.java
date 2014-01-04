import java.util.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int n = Integer.parseInt( br.readLine() );
		String[] tokens = ( br.readLine() ).split(" ");
		int x =  Integer.parseInt( tokens[0] );
		int y =  Integer.parseInt( tokens[1] );
		int z =  Integer.parseInt( tokens[2] );
 
		System.out.println(n + " " + x + " " + y + " " + z );
	}
}

/*
1
10 3 5
*/
