package multidigit;
import java.util.*;

public class MultiDigPostfix {

    public static int evaluatePostfix(String exp) {
        Stack<Integer> st = new Stack<>();
        String[] tokens = exp.split(" ");

        for (String token : tokens) {
            if (token.matches("-?\\d+")) { 
                st.push(Integer.parseInt(token));
            } else {
                int b = st.pop();
                int a = st.pop();

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

        String exp = "12 3 4 * + 10 -";

        int result = evaluatePostfix(exp);
        System.out.println("Postfix Expression: " + exp);
        System.out.println("Result = " + result);
    }
}
