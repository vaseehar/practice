package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidSudoku_36 {

    public static void main(String[] args) {
//		char[][] board = new char[][] { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
//				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
//				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
//				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
//				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        char[][] board = new char[][]{{'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'}, {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'}, {'.', '.', '4', '.', '.', '.', '.', '.', '.'}};
        System.out.println(new ValidSudoku_36().isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, List<Character>> rowMap = new HashMap<>(), columnMap = new HashMap<>();
        HashMap<String, List<Character>> gridMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (rowMap.get(i) == null) {
                    rowMap.put(i, new ArrayList<>());
                    ArrayList<Character> a = (ArrayList<Character>) rowMap.get(i);
                    a.add(board[i][j]);
                } else {
                    ArrayList<Character> a = (ArrayList<Character>) rowMap.get(i);
                    if (board[i][j] != '.' && a.contains(board[i][j])) {
                        return false;
                    } else {
                        a.add(board[i][j]);
                    }
                }

                if (columnMap.get(j) == null) {
                    columnMap.put(j, new ArrayList<>());
                    ArrayList<Character> a = (ArrayList<Character>) columnMap.get(j);
                    a.add(board[i][j]);
                } else {
                    ArrayList<Character> a = (ArrayList<Character>) columnMap.get(j);
                    if (board[i][j] != '.' && a.contains(board[i][j])) {
                        return false;
                    } else {
                        a.add(board[i][j]);
                    }
                }

                if (gridMap.get((i / 3) + "" + (j / 3)) == null) {
                    gridMap.put((i / 3) + "" + (j / 3), new ArrayList<>());
                    ArrayList<Character> a = (ArrayList<Character>) gridMap.get((i / 3) + "" + (j / 3));
                    a.add(board[i][j]);
                } else {
                    ArrayList<Character> a = (ArrayList<Character>) gridMap.get((i / 3) + "" + (j / 3));
                    if (board[i][j] != '.' && a.contains(board[i][j])) {
                        return false;
                    } else {
                        a.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }

}
