package Problem11;

public class Problem11 {
    public static void main(String[] args) {
        System.out.println(new Solution().minArray(new int[]{2,2,2,0,1}));
    }
}

class Solution {
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        int mid = left;
        while (numbers[left] >= numbers[right]) {
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = (left + right) / 2;
            if (numbers[mid] == numbers[left] && numbers[mid] == numbers[right]) {
                int min = left;
                for(int i = left + 1; i <= right; i++) {
                    if (numbers[i] < numbers[min])
                        min = i;
                }
                mid = min;
                break;
            }
            else if (numbers[mid] >= numbers[left])
                left = mid;
            else if (numbers[mid] <= numbers[right])
                right = mid;
        }
        return numbers[mid];
    }
}