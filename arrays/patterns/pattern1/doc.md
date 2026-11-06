  1. Understand the pattern
      For a given integer n:
        - Number of rows = n
        - Number of columns = n
        - Every position contains *
        - Each row contains exactly n stars.
      For example, n = 4:
          * * * *
          * * * *
          * * * *
          * * * *


      For n = 2:
          * *
          * *


  2. Think through the logic
      We need two nested loops:
      1. Outer loop: Controls the rows.
      2. Inner loop: Prints n stars in each row.
      3. After the inner loop finishes, move to the next line.
  
  
  
<!-- Bruteforce -->
  <!-- Pseudocode: -->
      FOR row FROM 1 TO n:
          FOR column FROM 1 TO n:
              PRINT "*"
          PRINT newline

<!-- Optimal solution -->
  <!-- Python solutions -->
    <!-- Approach 1 — Using nested loops (recommended for learning) -->
        class Solution:
            def pattern1(self, n):
                for row in range(n):
                    for column in range(n):
                        print("*", end="")
                    print()



    <!-- Approach 2 — Using string multiplication -->
        class Solution:
            def pattern1(self, n):
                for row in range(n):
                    print("*" * n)



  <!-- Java solution -->
        class Solution {
            public void pattern1(int n) {
                for (int row = 0; row < n; row++) {
                    for (int column = 0; column < n; column++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

in python folder
    python -m unittest -v test_solution.py

in java folder
    javac -d . Solution.java TestSolution.java
    java -cp . TestSolution