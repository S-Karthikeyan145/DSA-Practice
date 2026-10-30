class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        test(solution, new int[]{2, 5, 1, 3, 0}, 0, "Example 1");
        test(solution, new int[]{8, 10, 5, 7, 9}, 5, "Example 2");
        test(solution, new int[]{-3, -1, -7, -2}, -7, "Quiz input");
        test(solution, new int[]{42}, 42, "Single element");
        test(solution, new int[]{-10, -20, -30}, -30, "Negative numbers");
        test(solution, new int[]{5, 5, 5, 5}, 5, "Identical elements");
        test(solution, new int[]{5, 4, 3, 2, 1}, 1, "Smallest at end");
        test(solution, new int[]{1, 2, 3, 4, 5}, 1, "Smallest at start");
        test(solution, new int[]{100, -100, 50}, -100, "Large negative value");

        System.out.println("\nAll tests passed!");
    }

    private static void test(
        Solution solution,
        int[] arr,
        int expected,
        String testName
    ) {
        int actual = solution.smallestElement(arr);

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