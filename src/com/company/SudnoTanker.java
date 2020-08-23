package com.company;

public class SudnoTanker extends SeaTransport implements Printable {

    private double volume;

    public SudnoTanker(String color, int year, double weight, double volume) {
        super(color, year, weight);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("SudnoTanker Volume " + this.getVolume() +  " Color "  + getColor() + getWeight()
                + " Год выпуска " + getYear());

    }
}
