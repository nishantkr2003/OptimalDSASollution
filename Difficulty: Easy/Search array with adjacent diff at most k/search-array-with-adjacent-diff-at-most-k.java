// User function Template for Java

class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
                
            }
           // break;
        }
        return -1;
        //int i=0;
        
        // while(i<arr.length){
        //     if(arr[i] == x){
        //         return i;
        //     }
        //     i = Math.max()
        // }
    }
}