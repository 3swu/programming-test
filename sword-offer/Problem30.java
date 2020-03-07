package Problem30;

import java.util.Stack;

public class Problem30 {
    //TODO main
}

class MinStack {
    private Stack<Integer> stack;
    int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        min = Math.min(min, x);
    }

    public void pop() {
        if (min == stack.pop()) {
            min = Integer.MAX_VALUE;
            for (int x : stack)
                min = Math.min(min, x);
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */