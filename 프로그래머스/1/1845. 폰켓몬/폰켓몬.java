import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 폰켓몬의 종류가 담길 해쉬맵 선언
        HashMap<Integer,Integer> pocket = new HashMap<>();
        
        for(int num : nums){
            // 해쉬맵에 종류에 따른 개수 삽입 
            pocket.put(num,pocket.getOrDefault(num,0) + 1);
        }
        
        int maxSelect = nums.length / 2;
        int kindsOfPocket = pocket.size();
        
        if(kindsOfPocket > maxSelect) {
            answer = maxSelect;
        }
        else {
            answer = kindsOfPocket;
        }
        return answer;
    }
}