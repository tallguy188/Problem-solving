import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1,o2)-> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs) {
                return o1>o2 ? 1 : -1;
            }
            else
                return first_abs - second_abs;

        });

        while (N > 0) {
            int K = Integer.parseInt(br.readLine());
            if (K == 0) {
                if (priorityQueue.isEmpty()) {
                    sb.append(0).append("\n");
                }
                else {
                    sb.append(priorityQueue.poll()).append("\n");
                }
            }
            else {
                priorityQueue.add(K);
            }
            N--;
        }
        System.out.println(sb);

    }


}
