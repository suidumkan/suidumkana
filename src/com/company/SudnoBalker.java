package com.company;

public class SudnoBalker extends SeaTransport implements Printable {
    private int liftingCapacity;
    private String cargo;

    public SudnoBalker(String color, int year, double weight, int liftingCapacity, String cargo ) {
        super(color, year, weight);
        this.liftingCapacity = liftingCapacity;
        this.cargo = cargo;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void print() {
        System.out.println("Cargo " + this.getCargo() +  "Грузоподъемность " + this.getLiftingCapacity() +
                " Color " + getColor() + "Weight " + getWeight() +  " Год выпуска " + getYear());

    }
}
