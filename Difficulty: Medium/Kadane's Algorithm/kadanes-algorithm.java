class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        if(n==0){
            return 0;
        }
        
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            currSum += arr[i];
            maxSum = Math.max(currSum,maxSum);
            
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxSum;
        
    }
}
