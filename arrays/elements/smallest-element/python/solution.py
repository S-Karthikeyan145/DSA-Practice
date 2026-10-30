class Solution:
    def smallestElement(self, arr):
        smallest = arr[0]

        for num in arr:
            if num < smallest:
                smallest = num

        return smallest