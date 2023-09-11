import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String input = sc.next();

        int arr[] = new int[n];

        int sum = 0;

        for (int i= 0; i< input.length(); i++ ){

            arr[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        for(int i=0; i<n; i++ ) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
