package com.training.mars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void move() {
        Rover rover = new Rover(new Coordinate(0.0, 0.0), Orientation.NORTH);
        rover.move(Arrays.asList(Command.FORWARD, Command.FORWARD));
        System.out.println(rover.getLocation());
        assertEquals(2.0, rover.getLocation().getLon(), 0.1);
    }
}