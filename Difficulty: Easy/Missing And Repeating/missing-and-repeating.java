class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int[] freq = new int[n + 1];
        for (int num : arr) {
            freq[num]++;
        }

        int repeating = -1;
        int missing = -1;

        // find repeating and missing
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                repeating = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }
        
        result.add(repeating);
        result.add(missing);

        return result;
        
    }
}
