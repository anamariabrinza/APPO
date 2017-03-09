import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Player {
    public static Scanner scan = new Scanner(System.in);

    public static int row, col;
    public static char move = 'X';
    public static String player1;
    public static String player2;




    public static void Move( Board activeBoard ){
        boolean moving = true;

        activeBoard.ShowBoard();
        System.out.println();
        System.out.println();
        System.out.println(player1 + ", please introduce the row and column (a nr between 0 and 2)");
        while (moving){
            row = scan.nextInt();
            col = scan.nextInt();
            board[row][col]  = move; //apelare metoda de la obiect board
            if (GameStatus(row, col)){
                moving = false;
                if (move == 'X')
                    System.out.println(player1 + "  wins the game!");
                else
                    System.out.println(player2 + " wins the game!");
            }
            ShowBoard(3 );
            if(move == 'X'){
                move = 'O';}
            else
                move = 'X';
        }

    }

}
