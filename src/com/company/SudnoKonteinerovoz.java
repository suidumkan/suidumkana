package com.company;

public class SudnoKonteinerovoz extends SeaTransport implements Printable {
    private String typeofKonteiner;
    private double maximumCargo;

    public SudnoKonteinerovoz(String color, int year, double weight, String typeofKonteiner, double maximumCargo) {
        super(color, year, weight);
        this.typeofKonteiner = typeofKonteiner;
        this.maximumCargo = maximumCargo;
    }

    public String getTypeofKonteiner() {
        return typeofKonteiner;
    }

    public void setTypeofKonteiner(String typeofKonteiner) {
        this.typeofKonteiner = typeofKonteiner;
    }

    public double getMaximumCargo() {
        return maximumCargo;
    }

    public void setMaximumCargo(double maximumCargo) {
        this.maximumCargo = maximumCargo;
    }

    @Override
    public void print() {
        System.out.println("HighCube 40 " + getTypeofKonteiner() + " Cargo " + this.getMaximumCargo()
                +  " Color " +   getColor() + getYear() + getWeight());

    }
}
