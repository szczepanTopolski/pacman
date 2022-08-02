package org.mds.pacman;

public class SystemMovement implements Runnable {

    private final Pacman pacman;
    private MoveValidator moveValidator;

    public SystemMovement(Pacman pacman, MoveValidator moveValidator) {
        this.pacman = pacman;
        this.moveValidator = moveValidator;
    }

    @Override
    public void run() {
        for (; ; ) { //Should be changed to while(isGameWon) or sth
            try {   // HANDLE ALL CASES
                if (moveValidator.validateLeft(pacman)) {
                    pacman.modifyCoordinatesBasedOnDirection();
                }
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
