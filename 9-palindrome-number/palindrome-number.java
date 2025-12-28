class Solution {
    public boolean isPalindrome(int x) {
        int N=x;
        int reverseNum = 0 ;
        while(x>0){
            int last = x % 10 ;
            reverseNum = reverseNum *10 + last ;
            x = x / 10;
        }
        //return reverseNum ;

        if(N == reverseNum){
            return true;
        }
        else{
            return false;
        }
    }
}