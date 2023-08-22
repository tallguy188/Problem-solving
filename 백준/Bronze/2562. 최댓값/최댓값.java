import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] iarr = new int[9];

        for(int i = 0; i<iarr.length;i++) {

            int n = sc.nextInt();
            iarr[i] = n;
        }
        int max = iarr[0];
        int space = 1;
        for (int i=0; i<iarr.length;i++) {
            if (max < iarr[i]) {
                max = iarr[i];
                space = i+1;
            }
        }

        System.out.println(max);
        System.out.println(space);
    }
}
