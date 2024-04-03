class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length * 2;
        int[] answer = new int[len];
        
        for(int i=0;i<len;i++){
            if(i < len/2){
                answer[i] = nums[i];
            }else{
                answer[i] = nums[i-(len/2)];
            }
        }
        
        return answer;
    }
}