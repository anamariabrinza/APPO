package com.faf.tiktaktoe;

public class Board {

    private int size;
    private char[][] board ;
    private int[][] auxBoard; // This 2d-array is for memorizing the moves, so you can't make the same move twice.


    public Board(int size){ //constructor
        this.size = size;
        board = new char[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-'; //initiating the empty board
            }
        }
        auxBoard = new int[size][size];
    }

    public int getSize() {
        return size;
    }


    // Methods
    // Shows the Board. Prints it
    public void showBoard(){
        for (int i = 0; i <  size; i++){
            System.out.println();
            for(int j = 0; j< size; j++){
                if (j==0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " | ");
            }
        }
    }

    private int getCell(int x, int y) {
        return auxBoard[x][y];
    }

    // metoda returns true or false
    public boolean isCellFull(int x, int y){
        return getCell(x, y) !=0;

    }



    public void move(char mark, int x, int y) {
        board[x][y] = mark;
        auxBoard[x][y] = 1;
    }

    public char getMark( int x, int y){
        return board[x][y];
    }


}
