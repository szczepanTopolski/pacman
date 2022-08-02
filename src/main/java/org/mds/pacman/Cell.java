package org.mds.pacman;

public class Cell {
    private TerritoryElement territoryElement;


    public Cell(TerritoryElement territoryElement) {
        this.territoryElement = territoryElement;
    }

    public TerritoryElement getTerritoryElement() {
        return territoryElement;
    }

    @Override
    public String toString() {
        return this.territoryElement.toString();
    }

    enum TerritoryElement {
        POINT(1), FRUIT(2), WALL(3), NONE(4);
        private final int displayValue;
        // We could add here Image as a parameter?

        TerritoryElement(int displayValue) {
            this.displayValue = displayValue;
        }

        @Override
        public String toString() {
            return String.valueOf(displayValue);
        }
    }
}
