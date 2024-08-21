import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean [] visited;
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n];

        for(int i=0; i<n; i++) {
            A[i] = new ArrayList<Integer>();
        }
        arrive = false;
        visited = new boolean[n];

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[v].add(e);
            A[e].add(v);
        }


        for(int i=0; i<n; i++) {

            DFS(i,1);
            if(arrive)
                break;
        }

        if(arrive) {
            System.out.println("1");
        }
        else {
            System.out.printf("0");
        }
    }

    static void DFS(int now  ,int depth) {
        if(depth == 5 || arrive) {
            arrive = true;
            return;
        }

        visited[now] = true;
        for (int k  : A[now]) {
            if (!visited[k]) {
                DFS(k, depth + 1);
            }
        }

        visited[now] = false;
    }
}
