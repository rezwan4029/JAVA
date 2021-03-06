
import java.util.LinkedList;

/**
 * import javax.script.ScriptEngine; 
 * import javax.script.ScriptEngineManager;
 */

public class ExpressionParser {

  static boolean isDelim(char c) {
    return c == ' ';
  }

  static boolean isOperator(char c) {
    return c == '+' || c == '-' || c == '*' || c == '/' || c == '%';
  }

  static int priority(char op) {
    if (op == '+' || op == '-') {
      return 1;
    }
    if (op == '*' || op == '/' || op == '%') {
      return 2;
    }
    return -1;
  }

  static void processOperator(LinkedList<Integer> st, char op) {
    int r = st.removeLast();
    int l = st.removeLast();
    if (op == '+') {
      st.add(l + r);
    } else if (op == '-') {
      st.add(l - r);
    } else if (op == '*') {
      st.add(l * r);
    } else if (op == '/') {
      st.add(l / r);
    } else if (op == '%') {
      st.add(l % r);
    }
  }

  public static int eval(String s) {
    LinkedList<Integer> st = new LinkedList<Integer>();
    LinkedList<Character> op = new LinkedList<Character>();
    
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (isDelim(c))
        continue;

      if (c == '(')
        op.add('(');

      else if (c == ')') {
        while (op.getLast() != '(')
          processOperator(st, op.removeLast());
        op.removeLast();
      }

      else if (isOperator(c)) {
        while (!op.isEmpty() && priority(op.getLast()) >= priority(c))
          processOperator(st, op.removeLast());
        op.add(c);
      }

      else {
        String operand = "";
        while (i < s.length() && Character.isDigit(s.charAt(i)))
          operand += s.charAt(i++);
        --i;
        st.add(Integer.parseInt(operand));
      }
    }
    while (!op.isEmpty())
      processOperator(st, op.removeLast());
    return st.get(0);
  }

  public static void main(String[] args) throws Exception {
    // ScriptEngine engine = new
    // ScriptEngineManager().getEngineByName("JavaScript");

    // String exp = "1+2*3*4+3*(2+2)-100"; // 63
    String exp = "(2+300)*((21+3)*20+1)"; // 145262

    System.out.println(eval(exp));
  }
}
