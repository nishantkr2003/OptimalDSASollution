class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        
        if (l >= r) return;

        int mid = l + (r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        
        merge(arr,l,mid,r);
    }
    
    
    void merge(int[] arr, int l, int mid, int r){
        
        int[] temp = new int[r-l+1];
        int start1 = l;
        int start2 = mid+1;
        int i=0;
        
        while(start1 <=mid && start2<=r){
            if(arr[start1]<=arr[start2]){
                temp[i++]=arr[start1++];
            }
            else{
                temp[i++] = arr[start2++];
            }
        }
        
        while (start1 <= mid) {
            temp[i++] = arr[start1++];
        }
        while (start2 <= r) {
            temp[i++] = arr[start2++];
        }
        
        for (int x = 0; x < temp.length; x++) {
            arr[l + x] = temp[x];
        }
    }
}