package org.example;

public class Room {

    private int numR;
    private boolean reserve;

    public Room(int numR, boolean reserve) {
        this.numR = numR;
        this.reserve = reserve;
    }

    public int getNumR() {
        return numR;
    }

    public void setNumR(int numR) {
        this.numR = numR;
    }

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

}
