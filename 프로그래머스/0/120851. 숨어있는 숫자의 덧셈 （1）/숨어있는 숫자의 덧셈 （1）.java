class Solution {
    public int solution(String my_string) {
    
        int sum=0; 
        for(char c: my_string.toCharArray()) {
            if(Character.isDigit(c)) {
                
                int k = Character.getNumericValue(c);
                sum+=k;
            }  
        }
        return sum;
    }
}