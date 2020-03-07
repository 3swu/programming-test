package Problem31;

import java.util.Stack;

public class Problem31 {
    public static void main(String[] args) {
        System.out.println(new Solution().validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2}));
    }
}

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pushedIdx = 0;
        for (int i = 0; i < popped.length; i++) {
            if (!stack.empty() && stack.peek() == popped[i])
                stack.pop();
            else {
                while (pushedIdx < pushed.length && pushed[pushedIdx] != popped[i])
                    stack.push(pushed[pushedIdx++]);
                if (pushedIdx == pushed.length)
                    return false;
                stack.push(pushed[pushedIdx++]);
                stack.pop();
            }
        }
        return stack.empty() && pushedIdx == pushed.length;
    }
}