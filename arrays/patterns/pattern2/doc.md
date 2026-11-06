<!-- Pattern 2: Right-Angled Triangle Star Pattern -->

  Given:
  n = 5

  We need to print a pattern where:
  - The first row contains 1 star.
  - The second row contains 2 stars.
  - The third row contains 3 stars.
  - The number of stars increases by 1 in every row.

  Expected output:

      *
      **
      ***
      ****
      *****

  <!-- Understanding the pattern: -->

  Number of rows = n

  Number of stars in each row = row number

  For example, when n = 5:

      Row 1: *
      Row 2: **
      Row 3: ***
      Row 4: ****
      Row 5: *****

  <!-- Approach: Nested loops -->

  We use two loops to generate this pattern.

  1. Outer loop:
    Controls the number of rows.

  2. Inner loop:
    Controls the number of stars printed in each row.

  The important observation is:
      The number of stars in each row is equal to the current row number.

  <!-- Algorithm: -->

  Step 1: Start the outer loop

      Run the outer loop from 1 to n.
      for row in range(1, n + 1):
      This means the loop executes n times.

  Step 2: Run the inner loop

      For every row, print stars equal to the current row number.
      for column in range(1, row + 1):
      Notice that we use row instead of n.
      Why?
      Because the number of stars must increase with every new row.

  Step 3: Print the stars

      Print "*" without moving to the next line.
      print("*", end="")
      After the inner loop finishes, move to the next line.
      print()

  <!-- Python — Solution: -->

      class Solution:
          def pattern2(self, n):
              for row in range(1, n + 1):
                  for column in range(1, row + 1):
                      print("*", end="")
                  print()

  <!-- Java — Solution: -->

      class Solution {
          public void pattern2(int n) {
              for (int row = 1; row <= n; row++) {
                  for (int column = 1; column <= row; column++) {
                      System.out.print("*");
                  }
                  System.out.println();
              }
          }
      }


  <!-- Dry run: -->

  Given:
      n = 4

  Iteration 1:

      row = 1
      Inner loop:
          column = 1
      Print:
          *
      Move to the next line.

  Iteration 2:

      row = 2
      Inner loop:
          column = 1, 2
      Print:
          **
      Move to the next line.

  Iteration 3:

      row = 3
      Inner loop:
          column = 1, 2, 3
      Print:
          ***
      Move to the next line.

  Iteration 4:

      row = 4
      Inner loop:
          column = 1, 2, 3, 4
      Print:
          ****
      Move to the next line.


  <!-- Dry run table: -->

      n = 4

      Outer loop (row)    Inner loop (column)    Stars printed
           1                    1                     1
           2                   1, 2                   2
           3                 1, 2, 3                  3
           4                1, 2, 3, 4                4


  <!-- Final output: -->

      *
      **
      ***
      ****


  <!-- Visualize how the pattern grows: -->

      Row 1:  *          → 1 star
      Row 2:  **         → 2 stars
      Row 3:  ***        → 3 stars
      Row 4:  ****       → 4 stars

      Each new row adds exactly one star.


  <!-- Mathematical observation: -->

  Total number of stars:

      1 + 2 + 3 + ... + n

  Using the arithmetic series formula:

      Total stars = n * (n + 1) / 2

  Example:
      n = 5

      Total stars = 5 * (5 + 1) / 2
                  = 5 * 6 / 2
                  = 15

  Therefore, the pattern contains 15 stars.



  <!-- Automated Testing: -->

  Both implementations include predefined test cases.

  <!-- Python -->

      python -m unittest -v test_solution.py

  <!-- Java -->

      javac -d . Solution.java TestSolution.java
      java -cp . TestSolution


  <!-- Test cases: -->

      Input: n = 1
      Output:
      *

      Input: n = 2
      Output:
      *
      **

      Input: n = 4
      Output:
      *
      **
      ***
      ****

      Input: n = 5
      Output:
      *
      **
      ***
      ****
      *****


<!-- Complexity Summary: -->
      Time Complexity       O(n²)
      Auxiliary Space       O(1)
      Output Space          O(n²)


<!-- Key Learning: -->
  <!-- Pattern 1: -->
      Every row contains n stars.

      Inner loop:
          column <= n

  <!-- Pattern 2: -->
      Every row contains stars equal to its row number.

      Inner loop:
          column <= row

  The key difference is that Pattern 1 uses a fixed inner-loop limit, whereas Pattern 2 uses the current row number.
  This is the foundation for understanding more advanced nested-loop patterns.