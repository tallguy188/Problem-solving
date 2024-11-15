class Solution {
    public int solution(int hp) {
        int answer = 0;
        int count_a = 0;
        int count_b = 0;
        int last = 0;
        if(hp>=10){
            count_a = hp/5;
        }
        hp = hp - 5*count_a;
        
        if(hp >= 3 && hp<10) {
            count_b = hp/3;
        }
        hp = hp - 3*count_b;
        last = hp;
        
        answer = count_a+count_b+last;
        return answer;
    }
}