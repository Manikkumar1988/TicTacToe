package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private Board board;
    private Queue<Player> players;

    public Game() {
        board = new Board();
        players = new LinkedList<>();

        addPlayers();

    }

    private void addPlayers() {
        players.add(new Player("X"));
        players.add(new Player("O"));
    }


    private void startGame() throws IOException {
     do {
         Player currentPlayer = players.remove();
         System.out.println("Enter position for Player "+currentPlayer.toString());

         java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

         board.placeMarker(currentPlayer,new Position(Integer.parseInt(in.readLine()),Integer.parseInt(in.readLine())));
         players.add(currentPlayer);
         System.out.println(board.toString());
         if(board.hasWon(currentPlayer)){
             break;
         }
     }while (board.hasEmptyPosition());
    }




    public static void main(String[] args) {
        Game game= new Game();
        try {
            game.startGame();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
