package com.codediagnostics.irms.users;

public class ProSolution {
    public static void main(String[] args) {

        BotMovement botMovement = new BotMovement();
        for (String arg : args) {
            botMovement.operate(arg);
            System.out.println(botMovement.getDirection() + "(" + botMovement.getCoOrdinates().getX() + "," + botMovement.getCoOrdinates().getY() + ")");
        }
    }
}
enum Direction {
    NORTH, EAST, SOUTH, WEST;
}

class BotMovement {

    private Direction direction = Direction.NORTH;

    private CoOrdinates coOrdinates = new CoOrdinates(0, 0);

    public Direction getDirection() {
        return direction;
    }

    public CoOrdinates getCoOrdinates() {
        return coOrdinates;
    }

    public void operate(String operationString) {
        String[] directionAndSteps = operationString.split("M");
        if(directionAndSteps.length <2){
            throw new RuntimeException("Invalid Input");
        }
        if (directionAndSteps[0] == null || directionAndSteps[1] == null) {
            throw new RuntimeException("Invalid Input");
        }
        try {
            Integer noOfMoves = Integer.valueOf(directionAndSteps[1]);
        } catch (Exception e) {
            throw new RuntimeException("Invalid No of Moves " + e.getMessage(), e);
        }

        String direction = directionAndSteps[0];
        String noOfMoves = directionAndSteps[1];

        directionChanger(direction);
        setCoOrdinates(Integer.valueOf(noOfMoves));
    }

    private void setCoOrdinates(Integer noOfMoves) {
        noOfMoves = Math.abs(noOfMoves);
        if (Direction.NORTH.equals(this.direction)) {
            Integer y = this.coOrdinates.getY() + noOfMoves;
            this.coOrdinates.setY(y);
        } else if (Direction.EAST.equals(this.direction)) {
            Integer x = this.coOrdinates.getX() + noOfMoves;
            this.coOrdinates.setX(x);
        } else if (Direction.SOUTH.equals(this.direction)) {
            Integer y = this.coOrdinates.getY() - noOfMoves;
            this.coOrdinates.setY(y);
        } else if (Direction.WEST.equals(this.direction)) {
            Integer x = this.coOrdinates.getX() - noOfMoves;
            this.coOrdinates.setX(x);
        } else {

        }
    }

    private void directionChanger(String operation) {
        if ("L".equalsIgnoreCase(operation)) {
            this.direction = Direction.values()[ Math.floorMod((this.direction.ordinal() - 1) , 4)];
        }
        if ("R".equalsIgnoreCase(operation)) {
            this.direction = Direction.values()[Math.floorMod((this.direction.ordinal() + 1) , 4)];
        }
    }
}

class CoOrdinates {
    @Override
    public String toString() {
        return "CoOrdinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    private Integer x;

    private Integer y;

    public CoOrdinates() {

    }

    public CoOrdinates(Integer x, Integer y) {
        this.x = (x);
        this.y = (y);
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = (x);
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = (y);
    }
}
