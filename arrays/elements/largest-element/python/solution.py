class Solution:
    def largestElement(self, nums):
        largest = nums[0]

        for num in nums:
            if num > largest:
                largest = num

        return largest