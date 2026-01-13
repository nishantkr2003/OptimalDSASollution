// User function Template for Java

class Solution {

    public void Rearrange(int a[], int n) {
        // Your code goes here
        
        int[] result = new int[a.length];
        int index = 0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                result[index] = a[i];
                 index++;
            }
           
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                result[index] = a[i];
                 index++;
            }
            
        }
        for(int i=0;i<result.length;i++){
            a[i] = result[i];
        }

    }
}