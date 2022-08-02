package org.mds.pacman;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MovementKeyAdapter extends KeyAdapter {

    private final Pacman pacman;
    private final MoveValidator moveValidator;

    public MovementKeyAdapter(Pacman pacman, MoveValidator moveValidator) {
        this.pacman = pacman;
        this.moveValidator = moveValidator;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> pacman.moveLeft();
            case KeyEvent.VK_RIGHT -> pacman.moveRight();
            case KeyEvent.VK_UP -> pacman.moveUp();
            case KeyEvent.VK_DOWN -> pacman.moveDown();
        }
    }
}
