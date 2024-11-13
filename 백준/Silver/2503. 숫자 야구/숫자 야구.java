import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    static int N;
    static boolean check[] = new boolean[1000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for(int i = 123; i<1000; i++) {
            String str = Integer.toString(i);
            if(str.charAt(0) == '0' || str.charAt(1) == '0' || str.charAt(2) == '0') continue;
            if(str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2) || str.charAt(2) == str.charAt(0)) continue;
            check[i] = true;
        }

        for(int i=0; i<N; i++) {
            st  = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int ans = 123; ans<1000; ans++) {
                if(check[ans]) {
                    int ns = 0;
                    int nb = 0;

                    for(int first = 0; first < 3; first++) {
                        char num_split = Integer.toString(num).charAt(first);

                        for(int second = 0; second <3; second++) {
                            char ans_split = Integer.toString(ans).charAt(second);
                            if(num_split == ans_split && first == second) {
                                ns++;
                            }
                            else if(num_split == ans_split && first != second) {
                                nb++;
                            }
                        }
                    }
                    if(ns == s && nb == b) check[ans] =true;
                    else check[ans] = false;
                }
            }
        }

        int count = 0;
        for(int k=123;k<1000; k++) {
            if(check[k]) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
