import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int checkArr[];
    static int myArr[];
    static int checkSecret;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());  // DNA 문자열의 길이
        int p = Integer.parseInt(st.nextToken()); //  부분문자열의 길이 , 슬라이딩 윈도우의 길이와 같다.

        int result = 0;  // 비밀번호 종류의 수

        char A[] = new char[s]; // 문자열 데이터
        checkArr = new int[4]; // 비밀번호 체크 배열
        myArr = new int[4]; // 현재 상태 배열

        checkSecret = 0; // 몇개의 문자와 관련된 개수를 충족했는지 판단하는 변수

        A = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<4;i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) {   // 0개이상이면 어차피 충족되니까 checkSecret을 늘려줌
                checkSecret++;
            }
        }

        for (int i=0; i<p; i++) {  // 슬라이딩 윈도우의 길이만큼 문자를 계속 추가해줌
            Add(A[i]);           // 새로 들어오는 문자열 처리 함수
        }
        if (checkSecret == 4) {
            result ++;
        }
        // 슬라이딩 윈도우 처리 부분
        for (int i=p; i<s;i++) {
            int j = i-p;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) {
                result ++;
            }
        }

        System.out.println(result);
        br.close();
    }

    private static void Add(char c) {   // 추가되는 문자열 처리 함수

        switch (c) {

            case 'A' :
                myArr[0]++;
                if(myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;

            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }

    private static void Remove(char c) {
        switch(c) {

            case 'A':
                if (myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                myArr[3]--;
                break;
        }

    }

}
