// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // code here
        int count = 0; 
        for(int i=1;i<Math.sqrt(n);i++){
            if(i*i<n){
                count++;
            }
        }
        return count;
    }
}