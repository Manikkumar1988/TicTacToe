package com;

public class Player {

    private final String type;

    Player(String type) {
        this.type = type;
    }

    public void play(Square square) {
        square.setPlayer(this);
    }

    public String getSymbol() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof String) {
            return type.equals(obj);
        } else if(obj instanceof Player) {
            Player tmp = (Player) obj;
            return tmp.equals(type);
        }
        return false;
    }
}
