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

        solution.pattern1(n);

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

        System.setOut(originalOut);
        System.out.println(testName + " PASSED");

    } finally {
        System.setOut(originalOut);
    }
}
    public static void main(String[] args) {

        checkPattern(1, "*\n", "Test 1: n = 1");

        checkPattern(2, "**\n**\n", "Test 2: n = 2");

        checkPattern(3, "***\n***\n***\n", "Test 3: n = 3");

        checkPattern(
            4,
            "****\n****\n****\n****\n",
            "Test 4: n = 4"
        );

        checkPattern(
            5,
            "*****\n*****\n*****\n*****\n*****\n",
            "Test 5: n = 5"
        );

        checkPattern(
            10,
            ("**********\n").repeat(10),
            "Test 6: n = 10"
        );

        checkPattern(0, "", "Test 7: n = 0");

        System.out.println("\nAll tests passed!");
    }
}