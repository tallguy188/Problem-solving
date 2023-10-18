class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        int length = numbers.length;
        for(int num: numbers) {
            sum += num;
        }
        answer = (double)sum / (double)length;
        return answer;
    }
}