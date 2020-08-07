package com.training.mars;

public class InvalidCommandException extends Exception {

    public InvalidCommandException() {
        super("Command is invalid.Pleasue use b, f ,r, l");

    }
}
