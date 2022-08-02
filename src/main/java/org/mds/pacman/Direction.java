package org.mds.pacman;

import javax.swing.ImageIcon;
import java.awt.Image;

import static org.mds.pacman.Paths.pacman;
import static org.mds.pacman.Paths.pacmanDown;
import static org.mds.pacman.Paths.pacmanDown2;
import static org.mds.pacman.Paths.pacmanLeft;
import static org.mds.pacman.Paths.pacmanLeft2;
import static org.mds.pacman.Paths.pacmanRight;
import static org.mds.pacman.Paths.pacmanRight2;
import static org.mds.pacman.Paths.pacmanUp;
import static org.mds.pacman.Paths.pacmanUp2;

public enum Direction {

    DOWN(new ImageIcon(pacmanDown), new ImageIcon(pacmanDown2), new ImageIcon(pacman)),
    LEFT(new ImageIcon(pacmanLeft), new ImageIcon(pacmanLeft2), new ImageIcon(pacman)),
    RIGHT(new ImageIcon(pacmanRight), new ImageIcon(pacmanRight2), new ImageIcon(pacman)),
    UP(new ImageIcon(pacmanUp), new ImageIcon(pacmanUp2), new ImageIcon(pacman));

    private Image next;
    private Image second;
    private Image third;

    Direction(ImageIcon next, ImageIcon second, ImageIcon third) {
        this.next = next.getImage();
        this.second = second.getImage();
        this.third = third.getImage();
    }

    public Image getNext() {
        return next;
    }

    public void moveNextImages() {
        moveNextImage(Direction.DOWN);
        moveNextImage(Direction.UP);
        moveNextImage(Direction.RIGHT);
        moveNextImage(Direction.LEFT);
    }

    private void moveNextImage(Direction direction) {
        Image temp = direction.next;
        direction.next = direction.second;
        direction.second = direction.third;
        direction.third = temp;
        sleep();
    }

    private void sleep() {
        //TODO remove sleep and find better way to make animation smooth
        try {
            Thread.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
