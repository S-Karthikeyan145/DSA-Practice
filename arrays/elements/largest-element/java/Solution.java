public class Solution {

    public int largestElement(int[] nums) {
        int largest = nums[0];

        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }
}