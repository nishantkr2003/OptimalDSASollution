class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        int n=arr.length;
        Arrays.sort(arr);
        double ans;
        if(n%2!=0){
            ans= (arr[n/2]);
        }else{
             ans=(double)(arr[n/2]+arr[n/2-1])/2;
        }
        return ans;
    }
}

