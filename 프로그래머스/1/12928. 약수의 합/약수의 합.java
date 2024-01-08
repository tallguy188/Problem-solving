import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;  
        ArrayList<Integer> resultList = new ArrayList<>(); 
        int a[] = new int[n + 1];  
        for (int i = 0; i <= n; i++) { 
            a[i] = i;
        }
        int k = 1; 
        int j = n;
        while (k <= j) {  
            if (a[k] * a[j] == n) {
                resultList.add(a[k]);
                if (k != j) { // k와 j가 같지 않을 때만 j를 추가
                    resultList.add(a[j]);
                }
                k++;
                j--;
            } else if (a[k] * a[j] < n) {
                k++;
            } else {
                j--;
            }
        }
        for (int num : resultList) {
            answer += num;
        }
        return answer;
    }
}
