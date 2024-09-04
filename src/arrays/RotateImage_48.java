package arrays;

public class RotateImage_48 {

    public static void main(String[] args) {
        new RotateImage_48().rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        boolean[][] visited = new boolean[n][n];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    visited[j][n - 1 - i] = true;
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][n - 1 - i];
                    matrix[j][n - 1 - i] = temp;
                }
            }
        }
    }

}
