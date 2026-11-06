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