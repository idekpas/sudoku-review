package com.company;

import java.util.Scanner;
public class Main {
    public static int[][] tab = new int[9][9];

    public static void main(String[] args) {
        Scanner gameScan = new Scanner(System.in);
        Sudoku sudoku = new Sudoku(gameScan);
        if (!sudoku.startup()) {
            return;
        } else {
            while (true) {
                System.out.println("\nKtórą Czynność chcesz wykonać?\n1: Pokazać plansze 2: wypełnić/zmienić pole 3: Zmienić poziom\n4: Sprawdzić wynik 5: Wyjść z programu");
                int x = gameScan.nextInt();

                switch (x) {
                    case 1:
                        sudoku.showSudoku(tab);
                        break;

                    case 2:
                        sudoku.fillSudoku(tab);
                        break;
                    case 3:

                        sudoku.levelSudoku(tab);
                        break;
                    case 4:
                        sudoku.validate(tab);
                        break;
                    case 5:
                        System.exit(0);
                }
            }

        }
    }
}
