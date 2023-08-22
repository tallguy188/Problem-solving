import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[3];

        arr[0] = b/100;
        arr[1] = (b%100)/10;
        arr[2] = (b%100)%10;


        System.out.println(a*arr[2]);
        System.out.println(a*arr[1]);
        System.out.println(a*arr[0]);
        System.out.println(a*b);
    }
}
