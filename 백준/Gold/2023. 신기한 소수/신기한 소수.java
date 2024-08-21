import java.util.Scanner;

public class Main {

    static int N;

    // DFS 함수와 소수인지 판별하는 함수가 필요
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    static void DFS(int number, int position) {
        if(position == N) {
            if(isPrime(number)) {
                System.out.println(number);
            }
            return;
        }
        for(int i=1; i<10; i++) {
            if(i%2 == 0) {
                continue;
            }
            if(isPrime(number*10+i)) {
                DFS(number*10+i, position+1);
            }
        }
    }

    static boolean isPrime(int m) {
        for(int i=2; i<m/2; i++) {
            if(m % i == 0) {
                return false;
            }
        }
        return true;
    }

}
