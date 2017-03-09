
public class Game {


    public static void main(String[] args){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                board[i][j] = '-';
            }
        }

        System.out.println("What is the name of the first player: ");
        player1 = scan.nextLine();

        System.out.println("What is the name of the second player: ");
        player2 = scan.nextLine();

        Move();

        public static boolean GameStatus(int rowPos, int colPos){
            // Analysing different scenarios

            //when it is perpendicular win
            //orizontal win
            if((board[0][colPos] == board[1][colPos]) && (board[0][colPos] == board[2][colPos]))
                return true;
            //verical win
            if (( board[rowPos][0] == board[rowPos][1]) && (board[rowPos][0] == board[rowPos][2]))
                return true;
            //diagonal win
            if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != '-')
                return true;

            if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != '-')
                return true;
            return false;

        }



    }
}
