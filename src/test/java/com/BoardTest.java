package com;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void hasEmptyPosition_shouldReturnFalse_IfEmptyPositionFilled(){
        //Given
        Board board = new Board();
        Player player = new Player();

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
        Player player = new Player();
        List<Square> nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();

        //When
        player.play(nonFilledEmptyPositionList);
        boolean noOfEmptyPosition = board.hasEmptyPosition();

        //Then
        assertEquals(true,noOfEmptyPosition);
    }

    @Test
    public void hasPlayerWon_shouldReturnTrue_IfVerticallyFilled() {
        //Given
        Board board = new Board();
        Player player = new Player();
        List<Square> nonFilledEmptyPositionList = board.getNonFilledEmptyPosition();


    }
}
