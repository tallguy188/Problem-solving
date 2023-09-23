import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int irr [] = new int[x];
        int result = 0;
        String[] b = br.readLine().split(" ");

        int y = Integer.parseInt(br.readLine());

        for (int i=0; i<b.length;i++) {
            irr[i] = Integer.parseInt(b[i]);
        }

        Arrays.sort(irr);

        for (int i=0; i<irr.length -1;i++) {
            for (int j=i+1; j<irr.length;j++) {
                if( irr[i] + irr[j] > y ) {
                    break;
                }
                else if (irr[i] + irr[j] == y) {
                    result +=1;
                }
            }

        }


        System.out.println(result);


    }


}
