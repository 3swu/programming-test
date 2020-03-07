package Problem33;

public class Problem33 {
    public static void main(String[] args) {
        System.out.println(new Solution().verifyPostorder(new int[]{4,6,7,5}));
    }
}

class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return work(postorder, 0, postorder.length - 1);
    }

    private boolean work(int[] postorder, int start, int end) {
        if (start >= end)
            return true;
        int root = end, mid = start, i = end - 1;
        for (; mid < end && postorder[mid] <= postorder[root]; mid++);
        for (; i >= mid && postorder[i] >= postorder[root]; i--);
        if (i != mid - 1) return false;
        return work(postorder, start, mid - 1) && work(postorder, mid, end - 1);
    }
}