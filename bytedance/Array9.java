package Array9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Array9 {
    public static void main(String[] args) {
        int[][] test = new int[][]{{1,4},{2,3}};
        int[][] result = new Solution().merge(test);
        for (int[] a : result)
            System.out.println(Arrays.toString(a));
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[][]{};
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                if (ints[0] == t1[0])
                    return ints[1] - t1[1];
                return ints[0] - t1[0];
            }
        });
        int start = intervals[0][0], end = intervals[0][1];
        List<int[]> result = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= end && intervals[i][1] >= end)
                end = intervals[i][1];
            else if (intervals[i][0] > end) {
                result.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new int[]{start, end});
        int[][] result_array = new int[result.size()][];
        result.toArray(result_array);
        return result_array;
    }
}