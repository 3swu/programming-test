class Solution:
    def searchRange(self, nums, target: int):
        list_len = len(nums)
        front, last = 0, list_len - 1

        target_loc = None

        while front <= last:
            mid = (front + last) // 2
            if nums[mid] < target:
                front = mid + 1
            
            elif nums[mid] > target:
                last = mid - 1
                
            elif nums[mid] == target:
                target_loc = mid
                break

        if target_loc == None:
            return [-1, -1]
        else:
            start, end = target_loc, target_loc
            # while nums[start] == target:
            #     start -= 1
            # while nums[end] == target:
            #     end += 1
            i = 0
            for i in list(range(0, target_loc))[::-1]:
                if nums[i] != target:
                    start = i + 1
                    break

            start = 0 if nums[0] == target else start

            i = 0

            for i in range(target_loc, list_len):
                if nums[i] != target:
                    end = i - 1
                    break
            
            end = list_len - 1 if nums[list_len - 1] == target else end

            return [start, end]

if __name__ == '__main__':
    # print(Solution().searchRange([5,7,7,8,8,10], 7))
    print(Solution().searchRange([5], 5))
