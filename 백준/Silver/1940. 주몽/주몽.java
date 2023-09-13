
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] irr = new int[n];
        int m  = sc.nextInt();

        for(int i=0; i<n; i++) {
            irr[i] = sc.nextInt();
        }

        Arrays.sort(irr);
        int count = 0;
        int i = 0;
        int j = irr.length-1;

        while(i<j) {
            if (m < irr[i] + irr[j]) {
                j--;
            }

            else if (m > irr[i] + irr[j]) {
                i++;
            }

            else {
                count ++;
                i++;
                j--;
            }
        }

        System.out.println(count);
    }

}
