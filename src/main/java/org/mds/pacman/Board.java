package org.mds.pacman;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements ActionListener {

    public static int x;
    public int y;

    public Board() {
        setPreferredSize(new Dimension(1000, 400));
        setFocusable(true);
        x = 100;
        y = 100;
        this.addKeyListener(new CustomKeyListener());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Image image = new ImageIcon("src\\main\\resources\\img.png").getImage();
        g2d.drawImage(image, x, y, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    static class CustomKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            Board.x += 10;
            System.out.println("Pressed: " + Board.x);
        }
    }
}
