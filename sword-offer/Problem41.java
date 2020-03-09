package Problem41;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem41 {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(-2);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(-3);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(-4);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(-5);
        System.out.println(medianFinder.findMedian());
    }
}

class MedianFinder {
    private int count;
    private Queue<Integer> leftHeap, rightHeap;

    /** initialize your data structure here. */
    public MedianFinder() {
        count = 0;
        leftHeap = new PriorityQueue<>(Collections.reverseOrder());
        rightHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (leftHeap.size() == rightHeap.size()) {
            leftHeap.add(num);
            rightHeap.add(leftHeap.poll());
        }
        else {
            rightHeap.add(num);
            leftHeap.add(rightHeap.poll());
        }
        count++;
    }

    public double findMedian() {
        if ((count & 1) == 1)
            return rightHeap.peek();
        return (double)(leftHeap.peek() + rightHeap.peek()) / 2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */