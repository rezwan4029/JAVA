import java.util.Scanner;
import java.util.Stack;

/**
 * @author rezwanul.islam
 * @category Data structure
 * <br>See <a href="https://www.hackerrank.com/challenges/ctci-balanced-brackets"</a> reference
 */
public class BalancedExpression {
    
	public static boolean isValid(char a, char b){
    	if(a == '(') return (b == ')');
    	if(a == '{') return (b == '}');
    	if(a == '[') return (b == ']');
    	return false;
    }
    
    public static boolean isBalanced(String expression) {
        int size = expression.length();
        
        if(size == 0) return true;
        if(size == 1) return false;
        
        Stack<Character>Stk = new Stack<Character>();
        Stk.push(expression.charAt(0));
        for(int i = 1 ; i < size ; i++){
        	char curr = expression.charAt(i);
        	if(curr == '(' || curr == '{' || curr == '['){
        		Stk.push(curr);
        	}else{
        		if(Stk.isEmpty()){
        			return false;
        		}
        		if(isValid(Stk.peek(), curr)){
        			Stk.pop();
        		}else{
        			return false;
        		}
        	}
        }
        return Stk.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

/******************
	Input : 
	
	3
	{[()]}
	{[(])}
	{{[[(())]]}}
 	
 	Output:
 	YES
	NO
	YES
  
*******************/
