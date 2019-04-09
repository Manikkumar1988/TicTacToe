package com;

import java.util.List;
import java.util.Random;

public class Player {

    private final Random random;

    Player() {
        random = new Random();
    }

    public void play(List<Square> nonFilledEmptyPositionList) {
        Square square = nonFilledEmptyPositionList.get(random.nextInt(nonFilledEmptyPositionList.size()));
        square.setPlayer(this);
    }
}
