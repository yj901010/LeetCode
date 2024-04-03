class Solution {
    public boolean isPalindrome(int x) {
        int reverseX = 0;
        int temp = x;

        while(temp > 0){
            int t = temp % 10;
            reverseX = reverseX * 10 + t;
            temp /= 10;
        }

        if ( reverseX == x ){
            return true;
        }else{
            return false;
        }
    }
}