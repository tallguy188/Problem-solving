
class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int index = 0;
        
        for(int i=1; i<array.length; i++) {
            
            if(array[i] > max){
                max = array[i];
                index = i;   
            }
        }
        
        int[] answer = new int[]{max,index};
        
        return answer;
    }
}