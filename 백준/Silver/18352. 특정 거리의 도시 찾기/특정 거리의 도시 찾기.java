import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int [] visited;
    static ArrayList<Integer>[] A;

    static List<Integer> answer;
    static int N,M,K,X; // 도시개수(노드), 도로개수(간선), 거리정보(최단거리), 출발도시번호
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        A = new ArrayList[N+1];
        visited = new int[N+1];
        answer = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a  = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
        }

        for(int i=1; i<=N; i++) {
            visited[i] = -1;
        }

        BFS(X);

        for(int i=1; i<=N; i++) {
            if(visited[i] == K) {
                answer.add(i);
            }
        }

        if(answer.isEmpty()) {
            System.out.println(-1);
        }

        Collections.sort(answer);

        for(int i: answer) {
            System.out.println(i);
        }
    }
    // 문제점: 방문배열이 BFS 할때마다 0으로 초기화된다.
    static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        visited[start]++;
        while(!queue.isEmpty()) {

            int now_node = queue.poll();

            for(int i: A[now_node]) {
                if(visited[i] == -1) {
                    queue.add(i);
                    visited[i]  = visited[now_node]+1;
                }
            }
        }
    }
}
