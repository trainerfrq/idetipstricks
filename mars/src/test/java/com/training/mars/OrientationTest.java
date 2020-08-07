package com.training.mars;

import static org.junit.Assert.*;

public class OrientationTest {

    @org.junit.Test
    public void rotateLeft() {
        Orientation orientation = Orientation.NORTH;
        assertEquals(Orientation.WEST, orientation.rotateLeft());
    }

    @org.junit.Test
    public void rotateRight() {
        Orientation orientation = Orientation.WEST;
        assertEquals(Orientation.NORTH, orientation.rotateRight());
    }
}