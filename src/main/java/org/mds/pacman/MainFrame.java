package org.mds.pacman;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    public static void main(String[] args) {
        System.out.println("Dupa");
        App app = new App();
        Board board = new Board();
        app.add(board);
        app.setSize(800, 400);
        board.setBackground(Color.BLACK);
        app.setVisible(true);
    }
}
