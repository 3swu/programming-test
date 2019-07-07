class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        if (len(nums1) + len(nums2)) % 2 == 1:
            i, p1, p2, mid, p = -1, 0, 0, (len(nums1) + len(nums2)) // 2, 0
            while p1 < len(nums1) and p2 < len(nums2):
                if nums1[p1] <= nums2[p2]:
                    p1 += 1
                    i += 1
                    p = 1
                else:
                    p2 += 1
                    i += 1
                    p = 2
                if i == mid:
                    return float(nums1[p1 - 1] if p == 1 else nums2[p2 - 1])

            if p1 == len(nums1):
                while True:
                    p2 += 1
                    i += 1
                    if i == mid:
                        return float(nums2[p2 - 1])
            if p2 == len(nums2):
                while True:
                    p1 += 1
                    i += 1
                    if i == mid:
                        return float(nums1[p1 - 1])
        else:
            i, p1, p2, p, mid = -1, 0, 0, 0, (len(nums1) + len(nums2) - 1) // 2
            while p1 < len(nums1) and p2 < len(nums2):
                if nums1[p1] <= nums2[p2]:
                    p1 += 1
                    i += 1
                    p = 1
                else:
                    p2 += 1
                    i += 1
                    p = 2
                if i == mid:
                    if p1 == len(nums1):
                        return ((nums1[p1-1] if p == 1 else nums2[p2-1]) + nums2[p2]) / 2
                    elif p2 == len(nums2):
                        return ((nums1[p1-1] if p == 1 else nums2[p2-1]) + nums1[p1]) / 2
                    else:
                        return ((nums1[p1-1] if p == 1 else nums2[p2-1]) + (nums1[p1] if nums1[p1] <= nums2[p2] else nums2[p2])) / 2
            if p1 == len(nums1):
                while True:
                    p2 += 1
                    i += 1
                    if i == mid:
                        return (nums2[p2-1] + nums2[p2]) / 2
            if p2 == len(nums2):
                while True:
                    p1 += 1
                    i += 1
                    if i == mid:
                        return (nums1[p1-1] + nums1[p1]) / 2
            
if __name__ == '__main__':
    nums1 = [1, 2]
    nums2 = [1, 1]
    print(Solution().findMedianSortedArrays(nums1, nums2))
