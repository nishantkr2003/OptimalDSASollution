class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long prefixSum = 0;
        long maxSum = Long.MIN_VALUE;
        long[] sum = new long[k];

        for(int i=0;i<k;i++){
            sum[i] = Long.MAX_VALUE/2;
        }

        sum[k-1] = 0;

        for(int j=0;j<n;j++){
            prefixSum += nums[j];
            maxSum = Math.max(maxSum, prefixSum - sum[j%k]);
            sum[j%k] = Math.min(sum[j%k], prefixSum);
        }

        return maxSum;
    }
}