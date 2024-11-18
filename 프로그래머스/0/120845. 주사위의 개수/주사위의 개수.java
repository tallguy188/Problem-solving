class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int garo = box[0];
        int sero = box[1];
        int height = box[2];
        
        int garo1 = garo / n ; 
        int sero1 = sero / n;
        int one_side = garo1 * sero1;
        int height1 = height / n;
        
        answer = one_side * height1;
        
        return answer;
    }
}