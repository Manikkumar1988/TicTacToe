package com;

public class Board {

    public static final int BOUNDARY = 3;

    private final Square boardLayout[][];

    public Board() {
        boardLayout = new Square[BOUNDARY][BOUNDARY];

        for(int row=0;row<BOUNDARY;row++) {
            for(int col=0;col<BOUNDARY;col++) {
                boardLayout[row][col] = new Square(new Position(row, col));
            }
        }
    }

    public boolean hasEmptyPosition() {
        for(int row=0;row<BOUNDARY;row++) {
            for(int col=0;col<BOUNDARY;col++) {
                if(boardLayout[row][col].isEmpty())
                    return true;
            }
        }
        return false;
    }


    public boolean hasWon(Player player) {
        if(isVerticallyFilled(player)){
            return true;
        } else if(isHorizontallyFilled(player)) {
            return true;
        }
        return false;
    }

    private boolean isHorizontallyFilled(Player player) {
        for(int row = 0; row<BOUNDARY ; row++) {
            int count = 0;
            for(int col = 0;col<BOUNDARY;col++) {
                if(boardLayout[row][col].equals(player)){
                    count++;
                }
            }
            if(count == 3)
                return true;
        }
        return false;
    }

    private boolean isVerticallyFilled(Player player) {
        for(int col = 0;col<BOUNDARY;col++) {
            int count = 0;
            for(int row = 0; row<BOUNDARY ; row++) {
                 if(boardLayout[row][col].equals(player)){
                     count++;
                 }
            }
            if(count == 3)
                return true;
        }
        return false;
    }

    public void placeMarker(Player player, Position position) {
        if(isLegalMove(getSquare(position))) {
            player.play(getSquare(position));
        }
    }

    private Square getSquare(Position position) {
        return boardLayout[position.getRow()][position.getCol()];
    }

    private boolean isLegalMove(Square square) {
        return square.isEmpty();
    }

    @Override
    public String toString() {
        StringBuffer bl = new StringBuffer();
        for(int row=0;row<BOUNDARY;row++) {
            for (int col = 0; col < BOUNDARY; col++) {
                bl.append(boardLayout[row][col].toString());
                bl.append("\t");
            }
            bl.append("\n");
        }
        return bl.toString();
    }
}
