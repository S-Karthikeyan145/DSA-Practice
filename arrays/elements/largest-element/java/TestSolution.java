public class TestSolution {

    private static final Solution solution = new Solution();

    private static int passed = 0;
    private static int failed = 0;

    private static void test(
            String testName,
            int[] input,
            int expected
    ) {
        int actual = solution.largestElement(input);

        if (actual == expected) {
            System.out.println("PASS: " + testName);
            passed++;
        } else {
            System.out.println("FAIL: " + testName);
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual:   " + actual);
            failed++;
        }
    }

    public static void main(String[] args) {

        System.out.println("Largest Element - Java Tests");
        System.out.println("-----------------------------");

        test(
            "Example 1",
            new int[]{3, 3, 6, 1},
            6
        );

        test(
            "Example 2",
            new int[]{3, 3, 0, 99, -40},
            99
        );

        test(
            "All negative numbers",
            new int[]{-4, -3, -10, -2, -8},
            -2
        );

        test(
            "Single element",
            new int[]{5},
            5
        );

        test(
            "Duplicate elements",
            new int[]{7, 7, 7, 7},
            7
        );

        test(
            "Largest element at start",
            new int[]{100, 20, 30, 40},
            100
        );

        test(
            "Largest element at end",
            new int[]{1, 2, 3, 4, 5},
            5
        );

        test(
            "Zero and negative numbers",
            new int[]{-4, -3, 0, 1, -8},
            1
        );

        System.out.println("-----------------------------");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);

        if (failed > 0) {
            throw new AssertionError("Some tests failed!");
        }

        System.out.println("ALL TESTS PASSED");
    }
}