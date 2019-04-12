package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void toString_shouldReturnUnderscore_IfEmpty() {
        Square square = new Square(new Position(0,1));
        assertEquals(square.toString(), "_");
    }

    @Test
    public void toString_shouldReturnPlayerSymbol_IfOccupied() {
        Square square = new Square(new Position(0,1));
        square.setPlayer(new Player("X"));
        assertEquals(square.toString(), "X");
    }

}