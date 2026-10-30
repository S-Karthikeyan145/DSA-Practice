class Solution {
    public int smallestElement(int[] arr) {
        int smallest = arr[0];

        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }
}