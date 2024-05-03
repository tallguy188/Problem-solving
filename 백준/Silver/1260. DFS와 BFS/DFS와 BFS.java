import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer> [] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        A = new ArrayList[n+1];

        for(int i=1; i<=n; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++ ){
            String line = br.readLine();
            st = new StringTokenizer(line);
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        for(int i=1; i<=n;i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[n+1];
        DFS(k);
        System.out.println();
        visited  = new boolean[n+1];
        BFS(k);
    }

    public static void DFS(int k){
        System.out.print(k + " ");
        visited[k] = true;
        for (int i: A[k]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int k){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(k);
        visited[k] = true;

        while(!queue.isEmpty()) {
            int now_node = queue.poll();
            System.out.print(now_node + " ");
            for(int i: A[now_node]) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }

        }

    }
}
