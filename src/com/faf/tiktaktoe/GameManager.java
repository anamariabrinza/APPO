package com.faf.tiktaktoe;

import java.util.Scanner;

/**
 * Created by Amy on 3/10/2017.
 */
public class GameManager {

    private Scanner scanner = new Scanner(System.in);
    private Board board;
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
        initPlayers();
        System.out.println("Game is initialized, press enter to start it.");
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
        } while (!board.gameIsFinished());

        if(currentMark == 'O') {
            System.out.println("Player " + playerOne.getName() + " won !");
        } else {
            System.out.println("Player " + playerOne.getName() + " won !");
        }

    }

    private boolean areCoordinatesValid(int x, int y) {
        if(x > 3 || x < 0 || y > 3 || y < 0) {
            return false;
        }
        if(board.getCell(x, y) != 0) {
            return false;
        }
        return true;
    }


}
