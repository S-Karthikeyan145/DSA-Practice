<!-- Brute-force approach: -->

  Step:
  1. Sort the array in ascending order.
  2. Return the element at index 0.

  <!-- Python — Brute force -->
      class Solution:    
        def smallestElement(self, arr):        
          arr.sort()        
        return arr[0]

  <!-- Java — Brute force -->
      import java.util.Arrays;

      class Solution {
          public int smallestElement(int[] arr) {
              Arrays.sort(arr);
              return arr[0];
          }
      }


<!-- Optimal solution: -->

  1.Assume the first element is the smallest.
  2.Visit every element in the array.
  3.If the current element is smaller than our current minimum, update the minimum.
  4.After checking all elements, return the minimum.

  Steps:
  <!-- #1 -->
    Consider the example:
    arr = [2, 5, 1, 3, 0]


    Initially:
    smallest = 2

    We now examine each element.
    Step	Current-element	Previous-smallest	    Comparison	    New-smallest
     1	         2	              2	           2 < 2 → False	      2
     2	         5	              2	           5 < 2 → False	      2
     3	         1	              2	           1 < 2 → True	        1
     4	         3	              1	           3 < 1 → False	      1
     5	         0	              1	           0 < 1 → True	        0


    After checking every element:
    smallest = 0

    Return 0.

  <!-- #2 -->
    What happens with negative numbers?
    Consider your quiz input:
    arr = [-3, -1, -7, -2]


    Step	Current-element	Smallest-before-comparison	New-smallest
     1	         -3	                -3	                  -3
     2	         -1	                -3	                  -3
     3	         -7	                -3	                  -7
     4	         -2	                -7	                  -7

    Final result:   -7

  <!-- Python — Optimal solution:  -->

      class Solution:
        def smallestElement(self, arr):
            smallest = arr[0]

            for num in arr:
                if num < smallest:
                    smallest = num

            return smallest

  <!-- Java — Optimal solution:  -->

      class Solution {
        public int smallestElement(int[] arr) {
            int smallest = arr[0];

            for (int num : arr) {
                if (num < smallest) {
                    smallest = num;
                }
            }

            return smallest;
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