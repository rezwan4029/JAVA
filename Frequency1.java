import java.util.*;

public class CharFreqency {
    
  public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        int[] frequency = new int[256];
        int len = s.length() ;
        for(int i = 0 ; i < len ; i++ ){
                frequency[ s.charAt(i) ]++ ;
        }
        for(char c = 'a' ; c <= 'z' ; c++ ){
            if(frequency[c] == 0 )continue ;
            System.out.println(c + " = " + frequency[c] );
        }
    }
}
