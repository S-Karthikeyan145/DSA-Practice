import unittest
from solution import Solution


class TestSecondLargestElement(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_example_1(self):
        self.assertEqual(
            self.solution.secondLargestElement([8, 8, 7, 6, 5]),
            7
        )

    def test_all_elements_identical(self):
        self.assertEqual(
            self.solution.secondLargestElement([10, 10, 10, 10, 10]),
            -1
        )

    def test_given_quiz_input(self):
        self.assertEqual(
            self.solution.secondLargestElement([7, 7, 2, 2, 10, 10, 10]),
            7
        )

    def test_negative_numbers(self):
        self.assertEqual(
            self.solution.secondLargestElement([-10, -20, -30]),
            -20
        )

    def test_single_element(self):
        self.assertEqual(
            self.solution.secondLargestElement([5]),
            -1
        )

    def test_largest_at_end(self):
        self.assertEqual(
            self.solution.secondLargestElement([1, 2, 3, 4, 5]),
            4
        )

    def test_largest_at_start(self):
        self.assertEqual(
            self.solution.secondLargestElement([5, 4, 3, 2, 1]),
            4
        )

    def test_second_largest_is_negative_one(self):
        self.assertEqual(
            self.solution.secondLargestElement([-2, -1]),
            -2
        )

    def test_duplicate_second_largest(self):
        self.assertEqual(
            self.solution.secondLargestElement([1, 2, 2, 2]),
            1
        )


if __name__ == "__main__":
    unittest.main()