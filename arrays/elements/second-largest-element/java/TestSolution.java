class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        test(solution, new int[]{8, 8, 7, 6, 5}, 7, "Example 1");
        test(solution, new int[]{10, 10, 10, 10, 10}, -1, "All identical");
        test(solution, new int[]{7, 7, 2, 2, 10, 10, 10}, 7, "Quiz input");
        test(solution, new int[]{-10, -20, -30}, -20, "Negative numbers");
        test(solution, new int[]{5}, -1, "Single element");
        test(solution, new int[]{1, 2, 3, 4, 5}, 4, "Largest at end");
        test(solution, new int[]{5, 4, 3, 2, 1}, 4, "Largest at start");
        test(solution, new int[]{-2, -1}, -2, "Second largest is -2");
        test(solution, new int[]{1, 2, 2, 2}, 1, "Duplicate second largest");
    }

    private static void test(
        Solution solution,
        int[] nums,
        int expected,
        String testName
    ) {
        int actual = solution.secondLargestElement(nums);

        if (actual == expected) {
            System.out.println("PASS: " + testName);
        } else {
            System.out.println(
                "FAIL: " + testName
                + " | Expected: " + expected
                + " | Actual: " + actual
            );

            throw new AssertionError("Test failed: " + testName);
        }
    }
}