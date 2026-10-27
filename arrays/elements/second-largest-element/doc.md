<!-- Brute-force approach: -->

  1.Sort the array.
  2.Start from the last index, which contains the largest value.
  3.Move backward through the array.
  4.Find the first value that differs from the largest value.
  5.Return that value.
  6.If no different value exists, return -1.


  Consider:
    nums = [8, 8, 7, 6, 5]


    Step 1 — Sort the array in ascending order
    [5, 6, 7, 8, 8]

    Step 2 — Find the largest value
    Largest = 8

    Step 3 — Start at the last index and move backward

    Index	Value	Is-it-different-from-8?	Action
      4	    8	          No	             Skip
      3	    8	          No	             Skip
      2	    7	          Yes	             Return 7

  <!-- Python — Brute force -->

    class Solution:
      def secondLargestElement(self, nums):
          nums.sort()

          largest = nums[-1]

          for i in range(len(nums) - 2, -1, -1):
              if nums[i] < largest:
                  return nums[i]

          return -1


  <!-- Java — Brute force -->
    import java.util.Arrays;

    class Solution {
        public int secondLargestElement(int[] nums) {
            Arrays.sort(nums);

            int largest = nums[nums.length - 1];

            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] < largest) {
                    return nums[i];
                }
            }

            return -1;
        }
    }


<!-- Optimal solution: -->

  We'll maintain two variables:
  - largest: the largest value encountered so far.
  - second_largest: the second-largest distinct value encountered so far.
  For every number, there are three possibilities:
  1. The number is greater than largest.
    The previous largest becomes the second largest, and the new number becomes the largest.
  2. The number is smaller than largest but greater than second_largest.
    Update second_largest.
  3. The number is equal to either tracked value or is too small to improve the answer.
    Ignore it.

    Step 1:

      Input:
      nums = [7, 7, 2, 2, 10, 10, 10]


      Initially:
      largest = None
      second_largest = None

      Number	Largest	Second-largest	Explanation
        7	       7	       None	      First number becomes the largest
        7	       7	       None	      Duplicate of the largest; ignore
        2	       7	        2	        Smaller than 7; becomes the second largest
        2	       7	        2	        Duplicate of the second largest; no change
        10	    10	        7	        New largest; previous largest, 7, becomes second largest
        10	    10	        7	        Duplicate of the largest; ignore
        10	    10	        7	        Duplicate of the largest; ignore


      Final values:
      largest = 10
      second_largest = 7

      Return:
      7

  <!-- Python — Optimal solution:  -->

      class Solution:
          def secondLargestElement(self, nums):
              largest = None
              second_largest = None

              for num in nums:
                  if largest is None or num > largest:
                      second_largest = largest
                      largest = num

                  elif num != largest and (
                      second_largest is None or num > second_largest
                  ):
                      second_largest = num

              return second_largest if second_largest is not None else -1


  <!-- Java — Optimal solution:  -->

      class Solution {
          public int secondLargestElement(int[] nums) {
              Integer largest = null;
              Integer secondLargest = null;

              for (int num : nums) {
                  if (largest == null || num > largest) {
                      secondLargest = largest;
                      largest = num;
                  } else if (
                      num != largest &&
                      (secondLargest == null || num > secondLargest)
                  ) {
                      secondLargest = num;
                  }
              }

              return secondLargest != null ? secondLargest : -1;
          }
      }

<!-- Automated Testing: -->

Both implementations include predefined test cases.

<!-- Python -->
    cd python
    python -m unittest -v test_solution.py

<!-- Java -->
    cd java
    javac Solution.java TestSolution.java
    java TestSolution

<!-- Brute-force time	O(n\log n) -->
<!-- Optimal time	O(n) -->