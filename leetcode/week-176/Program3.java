package Program3;

import java.util.Arrays;
import java.util.Comparator;

public class Program3 {
    public static void main(String[] args) {
        int[][] test = new int[][]{{1,2},{1,2},{3,3},{1,5},{1,5}};
        System.out.println(new Solution().maxEvents(test));
    }
}

class Solution {
    public int maxEvents(int[][] events) {
        int[] days = new int[100001];
        int count = 0;
        Arrays.sort(events, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                if (ints[1] == t1[1])
                    return ints[0] - t1[0];
                return ints[1] - t1[1];
            }
        });

        for (int i = 0; i < events.length; i++) {
            for (int j = events[i][0]; j <= events[i][1]; j++) {
                if (days[j] == 0) {
                    days[j] = 1;
                    count ++;
                    break;
                }
            }
        }
        return count;

    }
}