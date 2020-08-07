package com.training.mars;

import java.util.ArrayList;
import java.util.List;

public enum Command {
    FORWARD('f'), BACKWARD('b'), ROTATE_LEFT('l'), ROTATE_RIGHT('r');

    private final char command;

    Command(char command) {
        this.command = command;
    }

    public static List<Command> getCommand(String command) throws InvalidCommandException {
        List<Command> commands = new ArrayList<>();
        for (int i = 0; i < command.length(); i++) {
            char commandAsCharacter = command.charAt(i);
            boolean found = false;
            for (Command c : Command.values()) {
                if (c.command == commandAsCharacter) {
                    commands.add(c);
                    found = true;
                }

            }
            if(!found){
                throw new InvalidCommandException();
            }
        }
        return commands;
    }
}
