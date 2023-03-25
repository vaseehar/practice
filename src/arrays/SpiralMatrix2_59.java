package arrays;

public class SpiralMatrix2_59 {

	public static void main(String[] args) {
		int[][] a = new SpiralMatrix2_59().generateMatrix(1);
		System.out.println("completed");
	}

	public int[][] generateMatrix(int n) {
		int[][] a = new int[n][n];
		boolean[][] visited = new boolean[n][n];
		int i = 0, j = 0, num = 1;
		String dir = "right";
		while (i < n && j < n && !visited[i][j]) {
			if (dir == "right") {
				while (j < n && !visited[i][j]) {
					visited[i][j] = true;
					a[i][j++] = num++;
				}
				j--;
				i++;
				dir = "down";
			} else if (dir == "down") {
				while (i < n && !visited[i][j]) {
					visited[i][j] = true;
					a[i++][j] = num++;
				}
				i--;
				j--;
				dir = "left";
			} else if (dir == "left") {
				while (j >= 0 && !visited[i][j]) {
					visited[i][j] = true;
					a[i][j--] = num++;
				}
				j++;
				i--;
				dir = "up";
			} else {
				while (i >= 0 && !visited[i][j]) {
					visited[i][j] = true;
					a[i--][j] = num++;
				}
				i++;
				j++;
				dir = "right";
			}
		}
		return a;
	}

}
