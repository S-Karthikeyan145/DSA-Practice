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