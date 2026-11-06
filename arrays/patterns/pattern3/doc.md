<!-- Pattern 3: Increasing Number Triangle -->

  Suppose:
      n = 5

  We need to print a pattern where:

      1
      12
      123
      1234
      12345


  <!-- Understanding the pattern: -->

    Number of rows = n
    Number of numbers in each row = row number
    Each row starts printing from 1.
    For example, when n = 5:
        Row 1: 1
        Row 2: 12
        Row 3: 123
        Row 4: 1234
        Row 5: 12345

  <!-- Approach: Nested loops -->

    We use two loops to generate this pattern.

    1. Outer loop:
      Controls the number of rows.
    2. Inner loop:
      Controls which numbers are printed in each row.
    The important observation is:
        Each row prints numbers starting from 1
        up to the current row number.


  <!-- Algorithm: -->

    Step 1: Start the outer loop
        Run the outer loop from 1 to n.
        for row in range(1, n + 1):
        This means the loop executes n times.

    Step 2: Run the inner loop
        For every row, print numbers from 1 to the current row number.
        for column in range(1, row + 1):
        Why use column?
        Because column represents the number that we need to print.

    Step 3: Print the current column number
        print(column, end="")
        This prints the number without moving to the next line.
        After the inner loop finishes, move to the next line.
        print()

  <!-- Python — Solution: -->

      class Solution:
          def pattern3(self, n):
              for row in range(1, n + 1):
                  for column in range(1, row + 1):
                      print(column, end="")
                  print()


  <!-- Java — Solution: -->

      class Solution {
          public void pattern3(int n) {
              for (int row = 1; row <= n; row++) {
                  for (int column = 1; column <= row; column++) {
                      System.out.print(column);
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
          1
      Move to the next line.

  Iteration 2:

      row = 2
      Inner loop:
          column = 1, 2
      Print:
          12
      Move to the next line.

  Iteration 3:

      row = 3
      Inner loop:
          column = 1, 2, 3
      Print:
          123
      Move to the next line.

  Iteration 4:

      row = 4
      Inner loop:
          column = 1, 2, 3, 4
      Print:
          1234
      Move to the next line.

  <!-- Dry run table: -->

      n = 4

      Outer loop (row)    Inner loop (column)    Numbers printed
           1                    1                       1
           2                   1, 2                    12
           3                 1, 2, 3                  123
           4                1, 2, 3, 4               1234

  <!-- Final output: -->

      1
      12
      123
      1234

  <!-- Visualize how the pattern grows: -->

      Row 1:  1          → 1 number
      Row 2:  12         → 2 numbers
      Row 3:  123        → 3 numbers
      Row 4:  1234       → 4 numbers
      Row 5:  12345      → 5 numbers

      Each new row adds the next consecutive number.


  <!-- Important observation: -->

  In Pattern 2:

      We print the same character "*" repeatedly.

      print("*", end="")

  In Pattern 3:

      We print the current column number.

      print(column, end="")

  The inner loop still depends on the current row number.




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
      1

      Input: n = 2
      Output:
      1
      12

      Input: n = 4
      Output:
      1
      12
      123
      1234

      Input: n = 5
      Output:
      1
      12
      123
      1234
      12345


  <!-- Complexity Summary: -->

      Time Complexity       O(n²)
      Auxiliary Space       O(1)
      Output Size           O(n²) in number of printed values


  <!-- Key Learning: -->

  Pattern 1:
      Every row contains n stars.

      Inner loop:
          column <= n

  Pattern 2:
      Every row contains stars equal to its row number.

      Inner loop:
          column <= row

  Pattern 3:
      Every row prints numbers from 1 to its row number.

      Inner loop:
          Print column
          column <= row

  The key difference in Pattern 3 is that the current column number
  is printed instead of a repeated character.

  This introduces number-based pattern generation using nested loops.