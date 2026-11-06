import unittest
from io import StringIO
from contextlib import redirect_stdout

from solution import Solution


class TestPattern2(unittest.TestCase):

    def setUp(self):
        self.solution = Solution()

    def check_pattern(self, n, expected):
        output = StringIO()

        with redirect_stdout(output):
            self.solution.pattern2(n)

        self.assertEqual(output.getvalue(), expected)

    def test_n_equals_1(self):
        self.check_pattern(1, "*\n")

    def test_n_equals_2(self):
        self.check_pattern(2, "*\n**\n")

    def test_n_equals_3(self):
        self.check_pattern(3, "*\n**\n***\n")

    def test_n_equals_4(self):
        self.check_pattern(4, "*\n**\n***\n****\n")

    def test_n_equals_5(self):
        self.check_pattern(5, "*\n**\n***\n****\n*****\n")

    def test_n_equals_10(self):
        expected = "".join("*" * row + "\n" for row in range(1, 11))
        self.check_pattern(10, expected)

    def test_n_equals_100(self):
        expected = "".join("*" * row + "\n" for row in range(1, 101))
        self.check_pattern(100, expected)


if __name__ == "__main__":
    unittest.main()