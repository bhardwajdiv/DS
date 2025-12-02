package multidigit;
import java.util.*;

public class MultiDigPrefix {

    public static int evaluatePrefix(String exp) {
        Stack<Integer> st = new Stack<>();
        String[] tokens = exp.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (token.matches("-?\\d+")) { 
                st.push(Integer.parseInt(token));
            } else {
                int a = st.pop();
                int b = st.pop();

                switch (token) {
                    case "+" -> st.push(a + b);
                    case "-" -> st.push(a - b);
                    case "*" -> st.push(a * b);
                    case "/" -> st.push(a / b);
                    case "%" -> st.push(a % b);
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {

        String exp = "+ 12 * 3 4";

        int result = evaluatePrefix(exp);
        System.out.println("Prefix Expression: " + exp);
        System.out.println("Result = " + result);
    }
}
