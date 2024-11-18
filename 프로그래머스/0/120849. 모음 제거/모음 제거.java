class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        char [] vowels = new char[]{'a','e','i','o','u'};
        
        for(int i=0; i<my_string.length(); i++){
            boolean isVowels = false;
            for(char c: vowels){
                if(my_string.charAt(i) == c) {
                    isVowels = true;
                    break;
                }
            }
            if(!isVowels){
                sb.append(my_string.charAt(i));
            }
        }
        String answer = sb.toString();
        return answer;
    }
}