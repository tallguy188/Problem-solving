class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        // DFS 탐색시 노드의 깊이와 numbers의 길이가 일치하면 
        // -> sum값과 target값을 비교하여 일치하면 answer++;
        
        dfs(numbers,0,target,0);
        
        return answer;
    }
    
    public void dfs (int[] numbers,int depth,int target,int sum) {
        // 마지막 노드까지 탐색한 경우
        if(depth == numbers.length) {
            if(target == sum) {
                answer++;
            }
        }
        // 탐색할 노드가 남아있는 경우
        else  {
            dfs(numbers,depth+1,target,sum + numbers[depth]);
            dfs(numbers,depth+1,target,sum - numbers[depth]);
        }
        
    }
}