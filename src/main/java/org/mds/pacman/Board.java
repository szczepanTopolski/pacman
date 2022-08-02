package org.mds.pacman;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import static org.mds.pacman.StringUtils.joinStrings;
import static org.mds.pacman.StringUtils.reduceStrings;

public class Board extends JPanel {
    private static final int BOARD_WIDTH = 800;
    private static final int BOARD_HEIGHT = 400;
    private final Pacman pacman;
    private Cell[][] cells;

    public Board() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setFocusable(true);
        setBackground(Color.BLACK);
        populateBoard();
        pacman = new Pacman(new AtomicInteger(100), new AtomicInteger(100));
        MoveValidator moveValidator = new MoveValidator(this);
        this.addKeyListener(new MovementKeyAdapter(pacman, moveValidator));
        new Thread(new SystemMovement(pacman, moveValidator)).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Image image = new ImageIcon(Paths.pacman).getImage();
        g2d.drawImage(image, pacman.getX(), pacman.getY(), this);
        repaint(); // Cant be hare if we want change images
    }

    private void populateBoard() {
        cells = new Cell[BOARD_WIDTH][BOARD_HEIGHT];
        Random random = new Random();
        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                int randomChoice = random.nextInt(Cell.TerritoryElement.values().length);
                cells[i][j] = new Cell(Cell.TerritoryElement.values()[randomChoice]);
            }
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    @Override
    public String toString() {
        return joinStrings(Arrays.stream(cells).map(row -> reduceStrings(Arrays.stream(row).map(Cell::toString))));
    }
}
