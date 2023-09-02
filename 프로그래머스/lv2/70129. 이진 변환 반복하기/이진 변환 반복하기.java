import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder resultBuilder = new StringBuilder();
        while (!s.equals("1")) {
            char[] carr = s.toCharArray();
            int countZero = 0;
            for (char c : carr) {
                if (c == '0') {
                    countZero+=1;
                } else {
                    resultBuilder.append(c);
                }
            }
            s = Integer.toBinaryString(resultBuilder.length());
            resultBuilder.setLength(0); // StringBuilder 초기화
            answer[1] += countZero;
            answer[0]+=1;
        }
        return answer;
    }
}