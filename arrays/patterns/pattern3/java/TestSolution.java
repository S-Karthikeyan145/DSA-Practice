import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestSolution {

    private static final Solution solution = new Solution();

    private static void checkPattern(
        int n,
        String expected,
        String testName
    ) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(output));

            solution.pattern3(n);

            String actual = output.toString()
                    .replace("\r\n", "\n")
                    .replace("\r", "\n");

            String normalizedExpected = expected
                    .replace("\r\n", "\n")
                    .replace("\r", "\n");

            if (!actual.equals(normalizedExpected)) {
                throw new AssertionError(
                    testName + " FAILED\n" +
                    "Expected: [" + normalizedExpected + "]\n" +
                    "Actual:   [" + actual + "]"
                );
            }

        } finally {
            System.setOut(originalOut);
        }

        // Print the success message AFTER restoring System.out.
        System.out.println(testName + " PASSED");
    }

    private static String expectedPattern(int n) {
        StringBuilder expected = new StringBuilder();

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                expected.append(column);
            }
            expected.append("\n");
        }

        return expected.toString();
    }

    public static void main(String[] args) {

        checkPattern(1, "1\n", "Test 1: n = 1");
        checkPattern(2, "1\n12\n", "Test 2: n = 2");
        checkPattern(3, "1\n12\n123\n", "Test 3: n = 3");
        checkPattern(4, "1\n12\n123\n1234\n", "Test 4: n = 4");
        checkPattern(5, "1\n12\n123\n1234\n12345\n", "Test 5: n = 5");

        checkPattern(
            10,
            expectedPattern(10),
            "Test 6: n = 10"
        );

        checkPattern(
            100,
            expectedPattern(100),
            "Test 7: n = 100"
        );

        System.out.println("\nAll tests passed!");
    }
}