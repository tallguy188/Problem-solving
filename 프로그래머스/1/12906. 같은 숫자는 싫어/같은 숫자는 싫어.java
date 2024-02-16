import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }
    

        int size = stack.size();
        int[] intArray = new int[size];
        for (int i = size-1; i >=0 ; i--) {
            intArray[i] = stack.pop();
        }

        return intArray;
    }
}
