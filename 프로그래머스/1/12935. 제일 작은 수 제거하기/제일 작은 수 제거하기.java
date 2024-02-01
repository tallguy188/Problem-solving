import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        
        if(list.size() == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        
        for(int i=0; i<list.size();i++) {
            if(list.get(i) < min ) {
                min = list.get(i);
            }
        }
        list.remove(Integer.valueOf(min));
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}