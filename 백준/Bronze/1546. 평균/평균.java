import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        double drr[]= new double[n];
        for(int i=0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);   // 입력받은 정수배열을 정렬

        int max  = arr[arr.length-1];
        double sum = 0;
        for(int i=0; i<n; i++) {
            drr[i] = (double)arr[i] / max *100;
            sum += drr[i];
        }
        double result = sum/n;
        System.out.println(result);
    }
}
