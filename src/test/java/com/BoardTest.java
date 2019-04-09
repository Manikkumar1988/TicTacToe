package com;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void hasEmptyPosition_shouldReturnFalse_IfEmptyPositionFilled(){
        //Given
        Board board = new Board();
        Player player = new Player("X");

        //When
        List<Square> nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();
        do{
            player.play(nonFilledEmptyPositionList);
            nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();
        }while (nonFilledEmptyPositionList.size()>0);


        boolean noOfEmptyPosition = board.hasEmptyPosition();

        //Then
        assertEquals(false,noOfEmptyPosition);
    }

    @Test
    public void hasEmptyPosition_shouldReturnTrue_IfEmptyPositionNotFilled(){
        //Given
        Board board = new Board();
        Player player = new Player("X");
        List<Square> nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();

        //When
        player.play(nonFilledEmptyPositionList);
        boolean noOfEmptyPosition = board.hasEmptyPosition();

        //Then
        assertEquals(true,noOfEmptyPosition);
    }

    @Test
    public void hasPlayerWon_shouldReturnTrue_IfFirstColumnFilled() {
        //Given
        Board board = new Board();
        Player player = new Player("X");
        List<Square> nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();

        //when
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,0,0,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,1,0,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,2,0,player)));

        //Then
        assertEquals(true,board.hasWon(player));
    }

    @Test
    public void hasPlayerWon_shouldReturnTrue_IfSecondColumnFilled() {
        //Given
        Board board = new Board();
        Player player = new Player("X");
        List<Square> nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();

        //when
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,0,1,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,1,1,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,2,1,player)));

        //Then
        assertEquals(true,board.hasWon(player));
    }

    @Test
    public void hasPlayerWon_shouldReturnTrue_IfThirdColumnFilled() {
        //Given
        Board board = new Board();
        Player player = new Player("X");
        List<Square> nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();

        //when
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,0,2,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,1,2,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,2,2,player)));

        //Then
        assertEquals(true,board.hasWon(player));
    }


    @Test
    public void hasPlayerWon_shouldReturnTrue_IfFirstRowFilled() {
        //Given
        Board board = new Board();
        Player player = new Player("X");
        List<Square> nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();

        //when
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,0,0,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,0,1,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,0,2,player)));

        //Then
        assertEquals(true,board.hasWon(player));
    }

    @Test
    public void hasPlayerWon_shouldReturnTrue_IfSecondRowilled() {
        //Given
        Board board = new Board();
        Player player = new Player("X");
        List<Square> nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();

        //when
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,1,0,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,1,1,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,1,2,player)));

        //Then
        assertEquals(true,board.hasWon(player));
    }

    @Test
    public void hasPlayerWon_shouldReturnTrue_IfThirdRowFilled() {
        //Given
        Board board = new Board();
        Player player = new Player("X");
        List<Square> nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();

        //when
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,2,0,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,2,1,player)));
        player.play(Arrays.asList(getMatchingSquare(nonFilledEmptyPositionList,2,2,player)));

        //Then
        assertEquals(true,board.hasWon(player));
    }

    public Square getMatchingSquare(List<Square> nonFilledEmptyPositionList, int row, int col, Player player) {
        for(Square square:nonFilledEmptyPositionList) {
            if(square.getRow()==row && square.getCol() == col) {
                return square;
            }
        }
        return null;
    }
}
