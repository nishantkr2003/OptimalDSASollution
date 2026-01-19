class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        
        int n = arr.length;
        if(n==0) return 0;
        Arrays.sort(arr);
        
        int ans = arr[n-1] - arr[0];
        
        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;
        
        int max , min;
        
        for(int i=0;i<n-1;i++){
            
            max = Math.max(largest, arr[i]+k);
            min = Math.min(smallest, arr[i+1]-k);
            
            if(min<0){
                continue;
            }
            ans = Math.min(ans, max-min);
        }
        
        return ans;
    }
}
