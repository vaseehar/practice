package arrays;

import java.util.Arrays;

public class SpiralMatrix4_2326 {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(0);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(6);
		head.next.next.next.next = new ListNode(8);
		head.next.next.next.next.next = new ListNode(1);
		head.next.next.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next.next.next = new ListNode(9);
		head.next.next.next.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next.next.next.next = new ListNode(2);
//		head.next.next.next.next.next.next.next.next.next.next = new ListNode(5);
//		head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(5);
//		head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
		new SpiralMatrix4_2326().spiralMatrix(10, 1, head);
	}

	public int[][] spiralMatrix(int m, int n, ListNode head) {
		int[][] mat = new int[m][n];
		for (int[] a : mat) {
			Arrays.fill(a, -1);
		}
		int i = 0, j = 0;
		boolean[][] visited = new boolean[m][n];
		ListNode node = head;
		String dir = "right";
		while (node != null) {
			if (dir == "right") {
				while (j < n && !visited[i][j] && node != null) {
					visited[i][j] = true;
					if (node != null) {
						mat[i][j++] = node.val;
						node = node.next;
					}
				}
				j--;
				i++;
				dir = "down";
			} else if (dir == "down") {
				while (i < m && !visited[i][j] && node != null) {
					visited[i][j] = true;
					if (node != null) {
						mat[i++][j] = node.val;
						node = node.next;
					}
				}
				j--;
				i--;
				dir = "left";
			} else if (dir == "left") {
				while (j >= 0 && !visited[i][j] && node != null) {
					visited[i][j] = true;
					if (node != null) {
						mat[i][j--] = node.val;
						node = node.next;
					}
				}
				j++;
				i--;
				dir = "up";
			} else {
				while (i >= 0 && !visited[i][j] && node != null) {
					visited[i][j] = true;
					if (node != null) {
						mat[i--][j] = node.val;
						node = node.next;
					}
				}
				i++;
				j++;
				dir = "right";
			}
		}
		return mat;
	}
	//faster solution;without the need of visited array;
	public int[][] spiralMatrix1(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        for(int[] row: arr)   Arrays.fill(row,-1);
        int top = 0, left = 0, right = n-1, bottom = m-1;
        while(head != null){
            for(int i=left; i<=right && head != null; i++){
                arr[top][i] = head.val;
                head = head.next;
            }
            top++;
            for(int i=top; i<=bottom && head != null; i++){
                arr[i][right] = head.val;
                head = head.next;
            }
            right--;
            for(int i=right; i>=left && head != null; i--){
                arr[bottom][i] = head.val;
                head = head.next;
            }
            bottom--;
            for(int i=bottom; i>=top && head != null; i--){
                arr[i][left] = head.val;
                head = head.next;
            }
            left++;
        }
        return arr;
    }

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
