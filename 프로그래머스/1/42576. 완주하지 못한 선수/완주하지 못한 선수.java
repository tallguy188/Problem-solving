import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> marathoners = new HashMap<>();
        for(String man: completion) {
            marathoners.put(man,marathoners.getOrDefault(man, 0) + 1);
        }
        //자바 key값에 대응하는 value 가져오기  = get(key값)
        for (String people : participant) {
            Integer count = marathoners.get(people);
            
            // 만약 카운트가 null이거나 0인 경우 완주하지 못한 선수입니다.
            if (count == null || count == 0) {
                answer = people;
                break;
            } else {
                // 완주한 선수에 대한 카운트를 1 감소시킵니다.
                // 해시맵은 중복을 허락하지 않으므로 기존 값보다 1이 감소하게 됨.
                marathoners.put(people, count - 1);
            }
        
        }
        return answer;
        
    }
}