import unittest
from solution import Solution


class TestSmallestElement(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_example_1(self):
        self.assertEqual(
            self.solution.smallestElement([2, 5, 1, 3, 0]),
            0
        )

    def test_example_2(self):
        self.assertEqual(
            self.solution.smallestElement([8, 10, 5, 7, 9]),
            5
        )

    def test_quiz_input(self):
        self.assertEqual(
            self.solution.smallestElement([-3, -1, -7, -2]),
            -7
        )

    def test_single_element(self):
        self.assertEqual(
            self.solution.smallestElement([42]),
            42
        )

    def test_all_negative_numbers(self):
        self.assertEqual(
            self.solution.smallestElement([-10, -20, -30]),
            -30
        )

    def test_all_identical_elements(self):
        self.assertEqual(
            self.solution.smallestElement([5, 5, 5, 5]),
            5
        )

    def test_smallest_at_end(self):
        self.assertEqual(
            self.solution.smallestElement([5, 4, 3, 2, 1]),
            1
        )

    def test_smallest_at_start(self):
        self.assertEqual(
            self.solution.smallestElement([1, 2, 3, 4, 5]),
            1
        )

    def test_large_negative_value(self):
        self.assertEqual(
            self.solution.smallestElement([100, -100, 50]),
            -100
        )


if __name__ == "__main__":
    unittest.main()