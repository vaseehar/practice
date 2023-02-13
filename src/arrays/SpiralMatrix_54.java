package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {

	public static void main(String[] args) {
		// System.out.println(new SpiralMatrix_54().spiralOrder(new int[][] { { 1, 2, 3
		// }, { 4, 5, 6 }, { 7, 8, 9 } }));
		// System.out.println(new SpiralMatrix_54().spiralOrder(new int[][] { { 1 } }));
		System.out.println(new SpiralMatrix_54().spiralOrder(new int[][] { { 1 }, { 2 } }));
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		String direction = "right";
		int maxI = matrix.length, maxJ = matrix[0].length, i = 0, j = 0;
		boolean[][] visited = new boolean[maxI][maxJ];
		List<Integer> result = new ArrayList<>();
		while (0 <= i && 0 <= j && i < maxI && j < maxJ && !visited[i][j]) {
			result.add(matrix[i][j]);
			visited[i][j] = true;
			if (direction == "right") {
				if (j == maxJ - 1 || visited[i][j + 1]) {
					direction = "down";
					i++;
				} else {
					j++;
				}
			} else if (direction == "down") {
				if (i == maxI - 1 || visited[i + 1][j]) {
					direction = "left";
					j--;
				} else {
					i++;
				}
			} else if (direction == "left") {
				if (j == 0 || visited[i][j - 1]) {
					direction = "up";
					i--;
				} else {
					j--;
				}
			} else if (direction == "up") {
				if (i == 0 || visited[i - 1][j]) {
					direction = "right";
					j++;
				} else {
					i--;
				}
			}
		}
		return result;
	}

}
