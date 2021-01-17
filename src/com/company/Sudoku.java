package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Sudoku {
    public Sudoku(Scanner gameScan) {
        this.gameScan = gameScan;
    }

    private  final Scanner gameScan;

    public  boolean startup() {

        System.out.println("Witamy w Sudoku Zugaj Edition V1\nBy rozpocząć rozgrywkę wpisz:  Sudoku");
        String x= gameScan.next();
        return x.equals("Sudoku");
    }

    public boolean validatePion(int[][] board){
        for(int z=0;z<=8;z++){
            for(int i=0;i<=8;i++) {
                for(int j=0;j<=8;j++){
                    if(i!=j){
                        if (board[z][i]==board[z][j]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public boolean validatePoziom(int[][] board){
        for(int i=0;i<=8;i++){
            for(int z=0;z<=8;z++) {
                for(int j=0;j<=8;j++){
                    if(z!=j){
                        if (board[z][i]==board[j][i]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public boolean validateKwadrat(int[][]board) {
        //String[] string=new String[9];
        for (int i = 0; i <= 6; i += 3) {
            for (int j = 0; j <= 6; j += 3) {
                int[] helping = {board[i][j], board[i + 1][j], board[i + 2][j], board[i + 1][j], board[i + 1][j + 1], board[i + 1][j + 2], board[i + 2][j], board[i + 2][j + 1], board[i + 2][j + 2]};
                Arrays.sort(helping);
                for (int a = 0; a <= 6; a++) {
                    for (int b = 0; b <= 8; b++) {
                        if (a != b) {
                            if (helping[a] == helping[b]) {
                                return false;
                            }
                        }
                    }

                    //System.out.println(strings[0] +strings[1] + strings[2] + strings[3] + strings[4] + strings[5] + strings[6] + strings[7] + strings[8]);

                }
            }
        }return true;
    }
    public void showSudoku(int[][] board){
        for (int i = 8; i >=0 ; i--) {
            System.out.print("\n");
            for (int z = 0; z<=8 ; z++) {
                if(z==0) {
                    System.out.print("| " + board[z][i] + " |");
                }else {
                    System.out.print(" " +board[z][i] + " |");
                }
            }
        }
    }
    public void validate(int[][] board){
        if((validateKwadrat(board) && validatePion(board) && validatePoziom(board))==true){
            System.out.println("Gratulacje, udało Ci się rozwiązać Sudoku :D ");
        }else {
            System.out.println("Coś poszło nie tak, zastanów się jeszcze raz");
        }

    }
    public void fillSudoku(int[][] board){
        System.out.println("Podaj współrzędne do zmiany: ");
        int x = gameScan.nextInt();
        int y = gameScan.nextInt();
        System.out.println("Wprowadź cyfrę na planszę: ");
        int a = gameScan.nextInt();
        board[x-1][y-1]=a;
    }
    public int[][] levelSudoku(int[][] board){
        System.out.println("Podaj level ( 1-3): ");
        int level = gameScan.nextInt();
        switch (level){
            case 1:
                board[0][0]=9;
                board[0][1]=0;
                board[0][2]=0;
                board[0][3]=0;
                board[0][4]=0;
                board[0][5]=7;
                board[0][6]=0;
                board[0][7]=0;
                board[0][8]=3;

                board[1][0]=0;
                board[1][1]=0;
                board[1][2]=2;
                board[1][3]=9;
                board[1][4]=0;
                board[1][5]=0;
                board[1][6]=0;
                board[1][7]=0;
                board[1][8]=0;

                board[2][0]=0;
                board[2][1]=0;
                board[2][2]=0;
                board[2][3]=4;
                board[2][4]=0;
                board[2][5]=5;
                board[2][6]=7;
                board[2][7]=1;
                board[2][8]=0;

                board[3][0]=0;
                board[3][1]=2;
                board[3][2]=3;
                board[3][3]=0;
                board[3][4]=7;
                board[3][5]=0;
                board[3][6]=8;
                board[3][7]=0;
                board[3][8]=0;

                board[4][0]=8;
                board[4][1]=5;
                board[4][2]=0;
                board[4][3]=0;
                board[4][4]=3;
                board[4][5]=6;
                board[4][6]=0;
                board[4][7]=0;
                board[4][8]=0;

                board[5][0]=0;
                board[5][1]=0;
                board[5][2]=0;
                board[5][3]=0;
                board[5][4]=0;
                board[5][5]=0;
                board[5][6]=3;
                board[5][7]=0;
                board[5][8]=0;

                board[6][0]=3;
                board[6][1]=7;
                board[6][2]=0;
                board[6][3]=0;
                board[6][4]=5;
                board[6][5]=4;
                board[6][6]=9;
                board[6][7]=0;
                board[6][8]=0;

                board[7][0]=0;
                board[7][1]=0;
                board[7][2]=0;
                board[7][3]=0;
                board[7][4]=6;
                board[7][5]=0;
                board[7][6]=0;
                board[7][7]=0;
                board[7][8]=0;

                board[8][0]=0;
                board[8][1]=0;
                board[8][2]=4;
                board[8][3]=0;
                board[8][4]=0;
                board[8][5]=0;
                board[8][6]=0;
                board[8][7]=3;
                board[8][8]=2;
                break;
            case 2:
                board[0][0]=9;
                board[0][1]=0;
                board[0][2]=0;
                board[0][3]=0;
                board[0][4]=0;
                board[0][5]=7;
                board[0][6]=0;
                board[0][7]=0;
                board[0][8]=3;

                board[1][0]=0;
                board[1][1]=0;
                board[1][2]=2;
                board[1][3]=9;
                board[1][4]=0;
                board[1][5]=0;
                board[1][6]=0;
                board[1][7]=0;
                board[1][8]=0;

                board[2][0]=0;
                board[2][1]=0;
                board[2][2]=0;
                board[2][3]=4;
                board[2][4]=0;
                board[2][5]=5;
                board[2][6]=7;
                board[2][7]=1;
                board[2][8]=0;

                board[3][0]=0;
                board[3][1]=2;
                board[3][2]=3;
                board[3][3]=0;
                board[3][4]=7;
                board[3][5]=0;
                board[3][6]=8;
                board[3][7]=0;
                board[3][8]=0;

                board[4][0]=8;
                board[4][1]=5;
                board[4][2]=0;
                board[4][3]=0;
                board[4][4]=3;
                board[4][5]=6;
                board[4][6]=0;
                board[4][7]=0;
                board[4][8]=0;

                board[5][0]=0;
                board[5][1]=0;
                board[5][2]=0;
                board[5][3]=0;
                board[5][4]=0;
                board[5][5]=0;
                board[5][6]=3;
                board[5][7]=0;
                board[5][8]=0;

                board[6][0]=3;
                board[6][1]=7;
                board[6][2]=0;
                board[6][3]=0;
                board[6][4]=5;
                board[6][5]=4;
                board[6][6]=9;
                board[6][7]=0;
                board[6][8]=0;

                board[7][0]=0;
                board[7][1]=0;
                board[7][2]=0;
                board[7][3]=0;
                board[7][4]=6;
                board[7][5]=0;
                board[7][6]=0;
                board[7][7]=0;
                board[7][8]=0;

                board[8][0]=0;
                board[8][1]=0;
                board[8][2]=4;
                board[8][3]=0;
                board[8][4]=0;
                board[8][5]=0;
                board[8][6]=0;
                board[8][7]=3;
                board[8][8]=2;
                break;
            default:
                board[0][0]=0;
                board[0][1]=0;
                board[0][2]=0;
                board[0][3]=0;
                board[0][4]=0;
                board[0][5]=0;
                board[0][6]=0;
                board[0][7]=0;
                board[0][8]=0;

                board[1][0]=0;
                board[1][1]=0;
                board[1][2]=0;
                board[1][3]=0;
                board[1][4]=0;
                board[1][5]=0;
                board[1][6]=0;
                board[1][7]=0;
                board[1][8]=0;

                board[2][0]=0;
                board[2][1]=0;
                board[2][2]=0;
                board[2][3]=0;
                board[2][4]=0;
                board[2][5]=0;
                board[2][6]=0;
                board[2][7]=0;
                board[2][8]=0;

                board[3][0]=0;
                board[3][1]=0;
                board[3][2]=0;
                board[3][3]=0;
                board[3][4]=0;
                board[3][5]=0;
                board[3][6]=0;
                board[3][7]=0;
                board[3][8]=0;

                board[4][0]=0;
                board[4][1]=0;
                board[4][2]=0;
                board[4][3]=0;
                board[4][4]=0;
                board[4][5]=0;
                board[4][6]=0;
                board[4][7]=0;
                board[4][8]=0;

                board[5][0]=0;
                board[5][1]=0;
                board[5][2]=0;
                board[5][3]=0;
                board[5][4]=0;
                board[5][5]=0;
                board[5][6]=0;
                board[5][7]=0;
                board[5][8]=0;

                board[6][0]=0;
                board[6][1]=0;
                board[6][2]=0;
                board[6][3]=0;
                board[6][4]=0;
                board[6][5]=0;
                board[6][6]=0;
                board[6][7]=0;
                board[6][8]=0;

                board[7][0]=0;
                board[7][1]=0;
                board[7][2]=0;
                board[7][3]=0;
                board[7][4]=0;
                board[7][5]=0;
                board[7][6]=0;
                board[7][7]=0;
                board[7][8]=0;

                board[8][0]=0;
                board[8][1]=0;
                board[8][2]=0;
                board[8][3]=0;
                board[8][4]=0;
                board[8][5]=0;
                board[8][6]=0;
                board[8][7]=0;
                board[8][8]=0;
                break;
        }return board;
    }


}
