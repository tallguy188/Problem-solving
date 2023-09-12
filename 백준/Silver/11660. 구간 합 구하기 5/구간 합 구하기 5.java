
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int fi[] = new int[m];
        int A[][] = new int[n+1][n+1];

        for (int i=1; i<=n; i++) {
           st = new StringTokenizer(br.readLine());
           for (int j=1; j<=n; j++) {
               A[i][j] = Integer.parseInt(st.nextToken());
           }
        }  // 이중 배열

        int D[][] = new int[n+1][n+1];

        for (int i=1; i<=n; i++) {
            for(int j=1; j<=n;j++) {

                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }  // 구간합 이중배열

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];

            fi[i] = result;
        }


        for (int num: fi){
            System.out.println(num);
        }
    }
}
