package org.mds.pacman;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MovementKeyAdapter extends KeyAdapter {

    private final Pacman pacman;

    public MovementKeyAdapter(Pacman pacman) {
        this.pacman = pacman;
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
