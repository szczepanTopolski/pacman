package org.mds.pacman;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.EventQueue;
import java.awt.HeadlessException;

public class MainFrame extends JFrame {
    private static final String TITLE = "PACMAN";

    public MainFrame() throws HeadlessException {
        super("Pacman");
        JPanel panel = new Board();
        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(MainFrame::new);
    }
}
