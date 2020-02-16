package Array5;

import java.util.PriorityQueue;
import java.util.Queue;

public class Array5 {
    public static void main(String[] args) {
        int[] test = new int[]{3,2,1,5,6,4};
        System.out.println(new Solution().findKthLargest(test, 2));
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        for (int n : nums) {
            priorityQueue.add(n);
            if (priorityQueue.size() > k)
                priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}