class Solution {
    boolean isPalindrome(String s) {
        // code here
        boolean palindrome = true;
        
        int first = 0;
        int last = s.length()-1;
        
        while(first<last){
            if(s.charAt(first) != s.charAt(last)){
                return false;
                
            }
            first++;
            last--;
        }
        return true;
    }
}