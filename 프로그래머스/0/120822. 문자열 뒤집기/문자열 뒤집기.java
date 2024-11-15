class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String [] str = new String[my_string.length()];
        
        for(int i=0; i<str.length; i++) {
            str[my_string.length()-i-1] = String.valueOf(my_string.charAt(i));
        }
        answer = String.join("",str);
        return answer;
    }
}