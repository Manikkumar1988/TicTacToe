package com;

import java.util.List;
import java.util.Random;

public class Player {

    private final Random random;
    private final String type;

    Player(String type) {
        this.type = type;
        random = new Random();
    }

    public void play(List<Square> nonFilledEmptyPositionList) {
        Square square = nonFilledEmptyPositionList.get(random.nextInt(nonFilledEmptyPositionList.size()));
        square.setPlayer(this);
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
