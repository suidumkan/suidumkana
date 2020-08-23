package com.company;

public class SeaTransport {
    public String color;
    public int year;
    public double weight;

    public SeaTransport(String color, int year, double weight) {
        this.color = color;
        this.year = year;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
