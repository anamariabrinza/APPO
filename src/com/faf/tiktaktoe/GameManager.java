package com.faf.tiktaktoe;

import java.util.Scanner;
/**
 * Manages the basic methods for my game in order it to start.
 * . Here is where I have the such methods as:  initPlayers(), initGame(), startGame(),
 * and  areCoordinatesValid().
 */

public class GameManager {

    private Scanner scanner = new Scanner(System.in);
    private Board board;
    private Game game;
    private Player playerOne;
    private Player playerTwo;
    private char currentMark = 'X';

    /*
     This is the constructor of the GameManager class
     */
    public GameManager(int size) {
        initGame(size);
    }


    private void initPlayers() {
        playerOne = new Player();
        playerTwo = new Player();
        System.out.println("Give name to the first player: ");
        playerOne.setName(scanner.nextLine());
        playerOne.setMark('X');
        System.out.println("Give name to the second player: ");
        playerTwo.setName(scanner.nextLine());
        playerTwo.setMark('O');

    }

    private void initGame(int size) {
        board = new Board(size);
        game = new Game();
        initPlayers();
        System.out.println("This is a primitive TIC Tac Toe!");
        System.out.println("RULES of the Game: The first player " + playerOne.getName() + " starts the game, by introducing the coordonates of X");
        System.out.println("Then teh second user follows. Now press enter to start the game");
        scanner.nextLine();
    }

    public void startGame() {
        int x, y;

        do {
            System.out.println("Give coordonates for mark : ");
            x = scanner.nextInt();
            y = scanner.nextInt();
            while(!areCoordinatesValid(x, y)) {
                System.out.println("Your move is wrong, Reenter");
                x = scanner.nextInt();
                y = scanner.nextInt();
            }
            board.move(currentMark, x, y);

            if (currentMark == 'X') {
                currentMark = 'O';
            } else {
                currentMark = 'X';
            }

            board.showBoard();
            System.out.println();
        } while (!game.gameIsFinished(board));

        if(currentMark == 'O') {
            System.out.println("Player " + playerTwo.getName() + " won !");
        } else {
            System.out.println("Player " + playerOne.getName() + " won !");
        }

    }

    private boolean areCoordinatesValid(int x, int y) {
        if(x > board.getSize() || x < 0 || y > board.getSize() || y < 0) {
            return false;
        }
        if(board.isCellFull(x, y) ) { //
            return false;
        }
        return true;
    }


}
