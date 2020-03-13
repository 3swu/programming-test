package Problem59_II;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem59_II {
}

class MaxQueue {
    Queue<Integer> queue = new LinkedList<>();
    int max = Integer.MIN_VALUE;

    public MaxQueue() {
    }

    public int max_value() {
        return queue.isEmpty() ? -1 : max;
    }

    public void push_back(int value) {
        queue.add(value);
        if (value > max) max = value;
    }

    public int pop_front() {
        if (queue.isEmpty()) return -1;
        int temp = queue.poll();
        if (temp == max) {
            max = Integer.MIN_VALUE;
            for (var n : queue)
                max = Math.max(max, n);
        }
        return temp;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */