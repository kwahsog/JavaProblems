package leetcode;

import java.util.HashSet;
import java.util.Set;

/** 36. Valid Sudoku
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * URL: https://leetcode.com/problems/valid-sudoku/
 * @author Alex
 *
 */

public class Solution36LC {

    public static boolean isValidSudoku(char[][] board) {

        //loop through rows
        HashSet<Character> rows = new HashSet<>();
        for(int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.' && !rows.add(board[i][j])) {
                    return false;
                }
            }
            rows.clear();
        }

        //loop through cols
        HashSet<Character> cols = new HashSet<>();
        for(int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[0].length; i++) {
                if (board[i][j] != '.' && !cols.add(board[i][j])) {
                    return false;
                }
            }
            cols.clear();
        }

        //loop through 3x3 grids
        HashSet<Character> grids = new HashSet<>();
        for (int i = 0; 3*i < board[0].length; i++) {
            for (int j = 0; 3*j < board.length; j++) {
                for (int k = 0; k < 3; k++){
                    for (int m = 0; m < 3; m++) {
                        if (board[3*i+k][3*j+m] != '.' && !grids.add(board[3*i+k][3*j+m])) {
                            return false;
                        }
                    }
                }
                grids.clear();
            }
            grids.clear();
        }
        return true;
    }

    public static void main (String args[]) {
        char[][] test = {{'8','.','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'} };
        System.out.println(isValidSudoku(test));

        char[][] test2 = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(test2));
    }
}
