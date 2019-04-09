package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Board {

    public static final int BOUNDARY = 3;

    private final Square boardLayout[][];

    public Board() {
        boardLayout = new Square[BOUNDARY][BOUNDARY];

        for(int row=0;row<BOUNDARY;row++) {
            for(int col=0;col<BOUNDARY;col++) {
                boardLayout[row][col] = new Square();
            }
        }
    }

    public boolean hasEmptyPosition() {
        for(int row=0;row<BOUNDARY;row++) {
            for(int col=0;col<BOUNDARY;col++) {
                if(Objects.isNull(boardLayout[row][col].getPlayer())) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Square> getNonFilledEmptyPosition() {
        List<Square> squares = new ArrayList<>();
        for(int row=0;row<BOUNDARY;row++) {
            for(int col=0;col<BOUNDARY;col++) {
                if(Objects.isNull(boardLayout[row][col].getPlayer())) {
                    squares.add(boardLayout[row][col]);
                }
            }
        }
        return squares;
    }


}
