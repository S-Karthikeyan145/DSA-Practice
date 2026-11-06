class Solution:
    def pattern1(self, n):
        for row in range(n):
            for column in range(n):
                print("*", end="")
            print()