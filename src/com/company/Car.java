package com.company;

public class Car implements Cloneable{
    private String brand = "";
    private String type = "";

    private String color = "";
    private String interior = "";
    private int power = 0;
    private int rimDiameter = 0;
    private boolean trailerHitch = false;

    public Car(String brand, String type, String color, String interior, int rimDiameter, boolean trailerHitch) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.interior = interior;
        this.rimDiameter = rimDiameter;
        this.trailerHitch = trailerHitch;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", interior='" + interior + '\'' +
                ", power=" + power +
                ", rimDiameter=" + rimDiameter +
                ", trailerHitch=" + trailerHitch +
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRimDiameter() {
        return rimDiameter;
    }

    public void setRimDiameter(int rimDiameter) {
        this.rimDiameter = rimDiameter;
    }

    public boolean isTrailerHitch() {
        return trailerHitch;
    }

    public void setTrailerHitch(boolean trailerHitch) {
        this.trailerHitch = trailerHitch;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car)super.clone();
    }


}
