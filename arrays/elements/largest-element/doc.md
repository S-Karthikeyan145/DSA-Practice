<!-- Brute-force approach -->

  Suppose:
  arr = [3, 2, 1, 5, 2]

  Step 1: Sort the array
      Arrange the elements in ascending order.
      Before sorting: [3, 2, 1, 5, 2]

      After sorting:  [1, 2, 2, 3, 5]

  Step 2: Get the last element
      Because the array is sorted in ascending order, its largest element is at the last index.
      Index:    0  1  2  3  4
      Array:   [1, 2, 2, 3, 5]

      The last index is:
              \[ n-1 \]
      Here, the array length is \(n=5\), so the last index is:
              \[ 5-1=4 \]
      Therefore:
              \[ \text{largest} = arr[n-1] = arr[4] = 5 \]

  <!-- Python — Brute force: -->

      def largest_element(arr):
          arr.sort()
              return arr[len(arr) - 1]
          
      arr = [3, 2, 1, 5, 2]
      print(largest_element(arr))


  Output:
  5

  You can also use arr[-1] in Python to access the last element.


  <!-- Java — Brute force: -->

      import java.util.Arrays;

      public class Main {
          public static int largestElement(int[] arr) {
              Arrays.sort(arr);
              return arr[arr.length - 1];
          }

          public static void main(String[] args) {
              int[] arr = {3, 2, 1, 5, 2};

              System.out.println(largestElement(arr));
          }
      }

<!-- Optimal solution: -->

  Step 1: Assume the first element is the largest
    Consider this array:
    arr = [3, 2, 1, 5, 2]

    Initially, we don't know which element is the largest.

    So, we make an assumption:
    largest = arr[0]


    Now:
    largest = 3

    Why choose the first element?

    Because we need an initial value to compare against the other elements.

    We aren't claiming that the first element is definitely the largest. We're simply using it as our starting point.
  Step 2: Traverse the array
    We examine each element from left to right.

    For every element, we ask:

    Is the current element greater than largest?

    If yes, update largest.

    If no, keep the existing value.

    Our condition is:
    if arr[i] > largest:    largest = arr[i]


    Let's Dry run
    Given:
    arr = [3, 2, 1, 5, 2]

    Initially:
    largest = 3

    Iteration	Index(i) arr[i]	largest-before-comparison	Condition	    largestaftercomparison
        1	       0	     3	              3            3 > 3 → False	          3
        2	       1       2	              3          	 2 > 3 → False	          3
        3	       2	     1	              3	           1 > 3 → False	          3
        4	       3     	 5             	  3            5 > 3 → True	            5
        5     	 4	     2	              5	           2 > 5 → False	          5

    After all five iterations:
      largest = 5

      Output: 5

      Visualize how largest changes
      Array:    [3, 2, 1, 5, 2]

      Start:     3
                ↓
      Compare:   2 < 3  → Keep 3
                ↓
      Compare:   1 < 3  → Keep 3
                ↓
      Compare:   5 > 3  → Update to 5
                ↓
      Compare:   2 < 5  → Keep 5
                ↓
      Final:     5
  <!-- Python — Optimal solution:  -->

      def largest_element(arr):
          largest = arr[0]

          for i in range(len(arr)):
              if arr[i] > largest:
                  largest = arr[i]

          return largest

      arr = [3, 2, 1, 5, 2]
      print(largest_element(arr))

      5




<!-- Brute-force time	O(n\log n) -->
<!-- Optimal time	O(n) -->