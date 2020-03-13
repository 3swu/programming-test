package Problem57_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem57_II {
}

class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> result = new ArrayList<>();
        int left = 0, right = 0;
        int windowLen = 1;
        for(; ;windowLen++) {
            left = 1;
            right = left + windowLen;
            int sum = (right * (right + 1)) / 2;
            if (sum > target)
                break;
            if (sum == target) {
                result.add(generateList(left, right));
                continue;
            }
            while (sum <= target) {
                sum -= (left++);
                sum += (++right);
                if (sum == target) {
                    result.add(generateList(left, right));
                    break;
                }
            }
        }
        int[][] res= result.toArray(new int[result.size()][]);
        Arrays.sort(res, new Comparator<int[]>() {
            @Override
            public int compare(int[] t0, int[] t1) {
                return t0[0] - t1[0];
            }
        });
        return res;
    }

    private int[] generateList(int start, int end) {
        int[] list = new int[end - start + 1];
        for (int i = start; i <= end; i++)
            list[i - start] = i;
        return list;
    }
}