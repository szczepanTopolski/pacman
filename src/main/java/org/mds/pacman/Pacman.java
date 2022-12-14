package org.mds.pacman;

import java.util.concurrent.atomic.AtomicInteger;

public class Pacman {

    private final AtomicInteger x;
    private final AtomicInteger y;
    private Direction direction;

    public Pacman(AtomicInteger x, AtomicInteger y) {
        this.x = x;
        this.y = y;
        direction = Direction.RIGHT;
    }

    public void modifyCoordinatesBasedOnDirection() {
        switch (direction) {
            case UP -> moveUp();
            case DOWN -> moveDown();
            case RIGHT -> moveRight();
            case LEFT -> moveLeft();
        }
    }

    void moveLeft() {
        x.getAndAdd(-10);
        direction = Direction.LEFT;
        direction.moveNextImages();
    }

    void moveRight() {
        x.getAndAdd(10);
        direction = Direction.RIGHT;
        direction.moveNextImages();
    }

    void moveUp() {
        y.getAndAdd(-10);
        direction = Direction.UP;
        direction.moveNextImages();
    }

    void moveDown() {
        y.getAndAdd(10);
        direction = Direction.DOWN;
        direction.moveNextImages();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x.get();
    }

    public int getY() {
        return y.get();
    }

}
