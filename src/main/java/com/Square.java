package com;

public class Square {

    private final Position position;

    private Player player;

    public Square(Position position) {
        this.position = position;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null;
    }

    public Position getPosition() {
        return position;
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


    @Override
    public String toString() {
        if(!isEmpty()) {
            return player.toString();
        }
        return "_";
    }
}
