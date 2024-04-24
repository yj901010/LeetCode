class Solution {
    public int tribonacci(int n) {
        int answer = 0;
        
        if(n == 0) return 0;
        if(n < 3) return 1;
        
        int prev = 0;
        int now = 1;
        int next = 1;
        
        for(int i=3;i<=n;i++){
            answer = prev + now + next;
            prev = now;
            now = next;
            next = answer;
        }
        return answer;
    }
}