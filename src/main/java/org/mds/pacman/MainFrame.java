package org.mds.pacman;

import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.HeadlessException;

public class MainFrame extends JFrame {
    private static final String TITLE = "PACMAN";

    public MainFrame() throws HeadlessException {
        super(TITLE);
        setTitle(TITLE);
        add(new Board());
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(MainFrame::new);
    }
}
