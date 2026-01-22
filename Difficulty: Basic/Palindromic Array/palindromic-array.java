/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        
        for(int i : arr){
            int reverse = 0;
            int num = i;
            while(num!=0){
                reverse = reverse * 10 + num%10;
                num/=10;
            }
            if(i != reverse){
                return false;
            }
        }
        return true;
    }
    
}