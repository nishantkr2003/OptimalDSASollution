class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
            
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while(!minHeap.isEmpty()){
            result.add(minHeap.poll());
        }
        
        Collections.reverse(result);
        return result;

    }
}
