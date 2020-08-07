package com.training.mars;

import java.util.List;

import static org.junit.Assert.*;

public class CommandTest {
    @org.junit.Test
    public void rotateLeft() throws InvalidCommandException {
        List<Command> lrl = Command.getCommand("lrl");
        assertEquals(Command.ROTATE_RIGHT,lrl.get(1));
    }

}