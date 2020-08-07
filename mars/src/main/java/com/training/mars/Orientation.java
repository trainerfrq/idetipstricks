package com.training.mars;

import java.util.Arrays;
import java.util.Optional;

public enum Orientation {

    NORTH(0), EAST(1), SOUTH(2), WEST(3);

    private final int index;

    Orientation(int i) {
        this.index = i;
    }

    Orientation rotateLeft() {

        final int newIndex = (this.index - 1 + 4) % 4;
        return Orientation.values()[newIndex];
    }

    Orientation rotateRight() {

        final int newIndex = this.index + 1;
        for(Orientation o: Orientation.values()){
            if(o.index==newIndex%4)
                return o;
        }
        throw new RuntimeException();
    }
}
