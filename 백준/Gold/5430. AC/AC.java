import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();

            Deque<Integer> deque = new LinkedList<>();
            boolean isReversed = false;
            boolean isError = false;

            String[] elements = input.substring(1, input.length() - 1).split(",");
            for (String element : elements) {
                if (!element.equals("")) {
                    deque.add(Integer.parseInt(element));
                }
            }

            for (char cmd : p.toCharArray()) {
                if (cmd == 'R') {
                    isReversed = !isReversed;
                } else if (cmd == 'D') {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isReversed) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            if (isError) {
                System.out.println("error");
            } else {
                printResult(deque, isReversed);
            }
        }
    }

    static void printResult(Deque<Integer> deque, boolean isReversed) {
        StringBuilder sb = new StringBuilder("[");

        while (!deque.isEmpty()) {
            if (isReversed) {
                sb.append(deque.pollLast());
            } else {
                sb.append(deque.pollFirst());
            }
            if (!deque.isEmpty()) {
                sb.append(",");
            }
        }

        sb.append("]");
        System.out.println(sb.toString());
    }
}
