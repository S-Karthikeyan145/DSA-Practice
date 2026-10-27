class Solution {
    public int secondLargestElement(int[] nums) {
        Integer largest = null;
        Integer secondLargest = null;

        for (int num : nums) {
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (
                num != largest &&
                (secondLargest == null || num > secondLargest)
            ) {
                secondLargest = num;
            }
        }

        return secondLargest != null ? secondLargest : -1;
    }
}