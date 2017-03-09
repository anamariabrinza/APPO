
public class Board {

    private int size;
    private char[][] board ;

    public Board(int size){ //constructor
        this.size = size;
        board = new char[size][size];
    }

    public int getSize() {
        return size;
    }

    public char[][] getBoard() {
        return board;
    }


    public void ShowBoard(){
        for (int i = 0; i <  size; i++){
            System.out.println();
            for(int j = 0; j< size; j++){
                if (j==0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " | ");
            }
        }

    }

    public void GiveCoord(){


    }
}
