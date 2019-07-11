class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        max_s, cur_s = 0, 0
        while left < right:
            cur_s = min(height[left], height[right]) * (right - left)
            max_s = cur_s if cur_s > max_s else max_s
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_s