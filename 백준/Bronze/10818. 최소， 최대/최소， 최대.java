import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int []numbers = new int[number];
        for (int i=0; i<number;i++){

            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print(numbers[0] + " ");
        System.out.println(numbers[numbers.length-1]);


    }
}
