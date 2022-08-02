package org.mds.pacman;

public class MoveValidator {

    private final Board board;

    public MoveValidator(Board board) {
        this.board = board;
    }

    public boolean validateLeft(Pacman pacman) { // HANDLE INDEX OUT OF BOUND
        return !board.getCells()[pacman.getX() - 10][pacman.getY()].getTerritoryElement().equals(Cell.TerritoryElement.WALL);
    }
}
