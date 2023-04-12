package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
            for (int cell = column; cell < board.length; cell++) {
            if ('X' != board[cell][column]) {
                result = false;
                break;
            }
        }
        return result;
    }
}