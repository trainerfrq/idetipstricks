package com.training.mars;

import java.util.List;

public class Rover {
    private Coordinate location;
    private Orientation orientation;

    public Rover(Coordinate location, Orientation orientation) {
        this.location = location;
        this.orientation = orientation;
    }

    public Coordinate getLocation() {
        return location;
    }

    private void move(Command command) {
        switch (command) {
            case FORWARD:
                moveForward(orientation);
        }
    }

    private void moveForward(Orientation orientation) {
        switch (orientation) {
            case NORTH:
                location = new Coordinate(this.location.getLon() + 1, this.location.getLat());
                break;
            case SOUTH:
                location = new Coordinate(this.location.getLon() - 1, this.location.getLat());
                break;
            case EAST:
                location = new Coordinate(this.location.getLon(), this.location.getLat() + 1);
                break;
            case WEST:
                location = new Coordinate(this.location.getLon(), this.location.getLat() - 1);
                break;
            default:
                throw new RuntimeException();
        }
    }

    public void move(List<Command> commands) {
        commands.forEach(command -> move(command));
    }
}
