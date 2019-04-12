package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void toString_shouldReturnSymbol_afterInitialize() {
        Player player = new Player("X");
        assertEquals("X",player.toString());
    }
}