package com;

import org.junit.Test;

import static com.Board.BOUNDARY;
import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void hasEmptyPosition_shouldReturnFalse_IfEmptyPositionFilled(){
        //Given
        Board board = new Board();
        Player player = new Player("X");

        //When
            for(int row=0;row<BOUNDARY;row++) {
                for (int col = 0; col < BOUNDARY; col++) {
                    board.placeMarker(player,new Position(row,col));
                }
            }



        boolean noOfEmptyPosition = board.hasEmptyPosition();

        //Then
        assertEquals(false,noOfEmptyPosition);
    }

    @Test
    public void hasEmptyPosition_shouldReturnTrue_IfEmptyPositionNotFilled(){
        //Given
        Board board = new Board();
        Player player = new Player("X");

        //When
        board.placeMarker(player, new Position(0,0));
        boolean noOfEmptyPosition = board.hasEmptyPosition();

        //Then
        assertEquals(true,noOfEmptyPosition);
    }

    @Test
    public void hasPlayerWon_shouldReturnTrue_IfFirstColumnFilled() {
        //Given
        Board board = new Board();
        Player player = new Player("X");

        //when
        board.placeMarker(player,new Position(0,0));
        board.placeMarker(player,new Position(1,0));
        board.placeMarker(player,new Position(2,0));

        //Then
        assertEquals(true,board.hasWon(player));
    }

    @Test
    public void hasPlayerWon_shouldReturnTrue_IfSecondColumnFilled() {
        //Given
        Board board = new Board();
        Player player = new Player("X");

        //when
        board.placeMarker(player,new Position(0,1));
        board.placeMarker(player,new Position(1,1));
        board.placeMarker(player,new Position(2,1));

        //Then
        assertEquals(true,board.hasWon(player));
    }



    @Test
    public void hasPlayerWon_shouldReturnTrue_IfFirstRowFilled() {
        //Given
        Board board = new Board();
        Player player = new Player("X");

        //when
        board.placeMarker(player,new Position(0,0));
        board.placeMarker(player,new Position(0,1));
        board.placeMarker(player,new Position(0,2));

        //Then
        assertEquals(true,board.hasWon(player));
    }

    @Test
    public void hasPlayerWon_shouldReturnTrue_IfSecondRowilled() {
        //Given
        Board board = new Board();
        Player player = new Player("X");

        //when
        board.placeMarker(player,new Position(1,0));
        board.placeMarker(player,new Position(1,1));
        board.placeMarker(player,new Position(1,2));

        //Then
        assertEquals(true,board.hasWon(player));
    }
}
