import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static boolean [][] visited; // 방문기록 저장배열
    static char [][] A;  // 타일 저장 배열
    static int n;
    static int m;

    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        A = new char[n][m];
        visited = new boolean[n][m];

        // 2차원 배열 초기화
        for (int i=0; i<n; i++ ){
            String line = br.readLine();
            for (int j=0; j<m; j++) {
                A[i][j] = line.charAt(j);
            }
        }
        count = countBoard();
        System.out.println(count);
    }

    public static int countBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(visited[i][j]) continue;
                if(A[i][j] == '-') dfs(i, j, true);
                else dfs(i, j, false);
                count++;
            }
        }
        return count;
    }

    public static void dfs(int i, int j, boolean row) {
        visited[i][j] = true;
        if(row) {
            j++;
            if (j < m && A[i][j] == '-') {
                dfs(i, j, true);
            }
        }
        else {
            i++;
            if (i < n && A[i][j] != '-') {
                dfs(i, j, false);
            }
        }
    }

}
