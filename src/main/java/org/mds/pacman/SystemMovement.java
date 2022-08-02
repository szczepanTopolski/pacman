package org.mds.pacman;

public class SystemMovement implements Runnable {

    private final Pacman pacman;

    public SystemMovement(Pacman pacman) {
        this.pacman = pacman;
    }

    @Override
    public void run() {
        for (; ; ) { //Should be changed to while(isGameWon) or sth
            try {
                pacman.modifyCoordinatesBasedOnDirection();
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
