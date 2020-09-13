package com.company;

public class RubberDuck {
    private int duckNumber;


    public RubberDuck(int duckNumber) {
        this.duckNumber = duckNumber;
    }

    public RubberDuck() {

    }

    public int getDuckNumber() {
        return duckNumber;
    }

    public void setDuckNumber(int duckNumber) {
        this.duckNumber = duckNumber;
    }

    @Override
    public String toString() {
        return "RubberDuck{" +
                "duckNumber=" + duckNumber +
                '}';
    }
}
