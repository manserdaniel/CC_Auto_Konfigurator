package com.company;

public class Car implements Cloneable{
    private String brand = "";
    private String type = "";

    private String color = "";
    private String interior = "";
    private int rimDiameter = 0;

    public Car(String brand, String type, String color, String interior, int rimDiameter, boolean trailerHitch) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.interior = interior;
        this.rimDiameter = rimDiameter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", interior='" + interior + '\'' +
                ", rimDiameter=" + rimDiameter +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public int getRimDiameter() {
        return rimDiameter;
    }

    public void setRimDiameter(int rimDiameter) {
        this.rimDiameter = rimDiameter;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car)super.clone();
    }
}
