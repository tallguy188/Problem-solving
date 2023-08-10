import java.util.*;
class Solution
//스택을 이용해서 문제를 푼다. 
{
    public int solution(String s)
    {
        char carr[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0;i < carr.length;i++) {
            char a = carr[i];
            if(stack.isEmpty()){
                stack.push(a);
            }
            else {
                if (stack.peek() == a) {
                    stack.pop();
                }
                else {
                    stack.push(a);
                }
            }
        }
        if(stack.isEmpty()) {
            return 1;
            
        }
        else {
            return 0;
        }
    }
}