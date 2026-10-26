import unittest

from solution import Solution


class TestLargestElement(unittest.TestCase):

    def setUp(self):
        self.solution = Solution()

    def test_example_1(self):
        self.assertEqual(
            self.solution.largestElement([3, 3, 6, 1]),
            6
        )

    def test_example_2(self):
        self.assertEqual(
            self.solution.largestElement([3, 3, 0, 99, -40]),
            99
        )

    def test_all_negative_numbers(self):
        self.assertEqual(
            self.solution.largestElement([-4, -3, -10, -2, -8]),
            -2
        )

    def test_single_element(self):
        self.assertEqual(
            self.solution.largestElement([5]),
            5
        )

    def test_duplicate_elements(self):
        self.assertEqual(
            self.solution.largestElement([7, 7, 7, 7]),
            7
        )

    def test_largest_element_at_start(self):
        self.assertEqual(
            self.solution.largestElement([100, 20, 30, 40]),
            100
        )

    def test_largest_element_at_end(self):
        self.assertEqual(
            self.solution.largestElement([1, 2, 3, 4, 5]),
            5
        )

    def test_zero_and_negative_numbers(self):
        self.assertEqual(
            self.solution.largestElement([-4, -3, 0, 1, -8]),
            1
        )


if __name__ == "__main__":
    unittest.main()