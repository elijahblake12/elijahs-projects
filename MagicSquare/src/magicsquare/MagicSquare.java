/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquare;

/**
 *
 * @author elijahblake12
 */
public class MagicSquare {

    private int[][] magicSquare;
    private boolean[] available;

    public MagicSquare() {
        magicSquare = new int[3][3];
        available = new boolean[9];
        for (int i = 0; i < available.length; i++) {
            available[i] = true;
        }
    }

    public void solve(int row, int col) {
        for (int i = 1; i <= 9; i++) {
            if (isAvailable(i)) {

                magicSquare[row][col] = i;
                available[i - 1] = false;

                if (isFilled()) {
                    if (isValidSolution()) {

                        printSolution();

                    }
                } else {
                    if (col != 2) {

                        solve(row, col + 1);
                    } else if (row != 2) {

                        solve(row + 1, 0);

                    }
                }
                magicSquare[row][col] = 0;
                available[i - 1] = true;
            }
        }
    }

    public boolean isAvailable(int value) {
        if (available[value - 1] == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidRow(int row) {
        if (magicSquare[row][0] + magicSquare[row][1] + magicSquare[row][2] == 15) {

            return true;
        } else {

            return false;
        }
    }

    public boolean isValidCol(int col) {
        if (magicSquare[0][col] + magicSquare[1][col] + magicSquare[2][col] == 15) {

            return true;
        } else {

            return false;
        }
    }

    public boolean isValidOnDiagonals() {
        if ((magicSquare[0][0] + magicSquare[1][1] + magicSquare[2][2] == 15) && (magicSquare[2][0] + magicSquare[1][1] + magicSquare[0][2] == 15)) {

            return true;
        } else {

            return false;
        }
    }

    public boolean isValidSolution() {
        for (int i = 0; i < magicSquare.length; i++) {
            if (!isValidRow(i) || !isValidCol(i)) {

                return false;
            }
        }

        return isValidOnDiagonals();
    }

    public boolean isFilled() {
        for (int i = 0; i < available.length; i++) {
            if (available[i]) {
                return false;
            }
        }
        return true;
    }

    public void printSolution() {
        for (int i = 0; i < magicSquare.length; i++) {
            System.out.println();
            for (int j = 0; j < magicSquare[i].length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MagicSquare magicsquare = new MagicSquare();
        magicsquare.solve(0, 0);
    }

}
