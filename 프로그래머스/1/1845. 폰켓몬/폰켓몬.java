import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> pocket = new HashMap<>();
        
        // 각 폰켓몬 종류별 개수를 세기
        for (int num : nums) {
            pocket.put(num, pocket.getOrDefault(num, 0) + 1);
        }
        
        // N/2마리 이내로 선택 가능한 폰켓몬 종류의 최댓값 계산
        int maxSelect = nums.length / 2;
        int numOfKinds = pocket.size(); // 폰켓몬 종류의 개수
        
        // 선택 가능한 폰켓몬 종류의 최댓값 계산
        if (numOfKinds >= maxSelect) {
            answer = maxSelect;
        } else {
            answer = numOfKinds;
        }
        
        return answer;
    }
}
