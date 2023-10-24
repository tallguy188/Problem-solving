import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        int result = 0;
        String input = br.readLine();

        for (int i=0; i<input.length();i++) {
            if (input.charAt(i) == '(') {
                stack.push('(');
            }
            if (input.charAt(i) == ')') {
                stack.pop();

                if (input.charAt(i-1) == '(' ) {
                    result +=  stack.size();
                }
                else {
                    result++;
                }

            }
        }
        System.out.println(result);

    }
}
