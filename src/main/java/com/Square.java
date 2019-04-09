package com;

public class Square {

    private final int row;
    private final int col;

    private Player player;

    public Square(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object obj) {
        if(player == null)
            return false;
        if(obj instanceof Player) {
            return this.player.equals(obj);
        }
        return false;
    }
}
