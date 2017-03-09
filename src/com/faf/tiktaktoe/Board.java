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
                board[i][j] = '-';
            }
        }
        auxBoard = new int[size][size];
    }

    public int getSize() {
        return size;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public int[][] getAuxBoard() {
        return auxBoard;
    }

    public void setAuxBoard(int[][] auxBoard) {
        this.auxBoard = auxBoard;
    }

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

    public int getCell(int x, int y) {
        return auxBoard[x][y];
    }

    public void move(char mark, int x, int y) {
        board[x][y] = mark;
        auxBoard[x][y] = 1;
    }

    public boolean gameIsFinished(){
        // Analysing different scenarios

        //when it is perpendicular win
        //vertical win
        if((board[0][0] == board[1][0]) && (board[0][0] == board[2][0]) && board[0][0] != '-' )
        return true;
        if((board[0][1] == board[1][1]) && (board[0][1] == board[2][1]) && board[0][1] != '-')
            return true;
        if((board[0][2] == board[1][2]) && (board[0][2] == board[2][2]) && board[0][2] != '-')
            return true;
        //horizontal win
        if (( board[0][0] == board[0][1]) && (board[0][0] == board[0][2]) && board[0][0] != '-')
            return true;
        if (( board[1][0] == board[1][1]) && (board[1][0] == board[1][2]) && board[1][0] != '-')
            return true;
        if (( board[2][0] == board[2][1]) && (board[2][0] == board[2][2]) && board[2][0] != '-')
            return true;
        //diagonal win
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != '-')
            return true;

        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != '-')
            return true;

        return false;

    }
}
