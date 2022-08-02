package org.mds.pacman;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.concurrent.atomic.AtomicInteger;

public class Board extends JPanel {
    private final Pacman pacman;


    public Board() {
        setPreferredSize(new Dimension(1000, 400));
        setFocusable(true);
        setBackground(Color.BLACK);
        pacman = new Pacman(new AtomicInteger(100), new AtomicInteger(100));
        this.addKeyListener(new MovementKeyAdapter(pacman));
        new Thread(new SystemMovement(pacman)).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Image image = new ImageIcon(Paths.pacman).getImage();
        g2d.drawImage(image, pacman.getX(), pacman.getY(), this);
        repaint(); // Cant be hare if we want change images
    }

}
