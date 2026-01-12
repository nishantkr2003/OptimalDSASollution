import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];

            // Overlap case
            if (current[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], current[1]);
            } 
            // No overlap
            else {
                newInterval = current;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
