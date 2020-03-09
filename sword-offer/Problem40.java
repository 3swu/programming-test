package Problem40;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem40 {
}

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t1 - t0;
            }
        });
        for (int n : arr) {
            priorityQueue.add(n);
            if (priorityQueue.size() > k)
                priorityQueue.poll();
        }
        return Arrays.stream(priorityQueue.toArray(new Integer[k])).mapToInt(Integer::valueOf).toArray();
    }
}