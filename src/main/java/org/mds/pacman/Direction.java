package org.mds.pacman;

import javax.swing.*;
import java.awt.*;

public enum Direction {

    DOWN(new ImageIcon(Paths.pacmanDown)), LEFT(new ImageIcon(Paths.pacmanLeft)),
    RIGHT(new ImageIcon(Paths.pacmanRight)), UP(new ImageIcon(Paths.pacmanUp));
    private final Image image;

    public Image getImage() {
        return image;
    }

    Direction(ImageIcon imageIcon) {
        this.image = imageIcon.getImage();
    }

}
