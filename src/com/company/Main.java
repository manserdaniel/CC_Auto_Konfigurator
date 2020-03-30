package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "318i", "Schwarz", "Stoff", 17, false));

        ArrayList<Car> tempCars = new ArrayList<>();
        Car carToSell = null;


        while (true) {
            try {

                tempCars = (ArrayList<Car>) cars.clone();

                System.out.println("Herzlich Wilkommen bei BMW!\nWelches Model möchten sie gerne? 318i, 320i, 320ixDrive, 330ixDrive oder 340ixDrive?");
                String model = scanner.nextLine();
                findCarType(cars, model, tempCars);

                System.out.println("Welche farbe soll das Auto haben? Schwarz, Weiss, Rot");
                String color = scanner.nextLine();
                findCarColor(cars, color, tempCars);

                System.out.println("Welches interior soll das Auto haben? Stoff oder Leder");
                String interior = scanner.nextLine();
                findCarInterior(cars, interior, tempCars);

                System.out.println("Welche Felgengöße möchten sie haben? 17, 18 oder 19 Zoll?");
                int rimDiameter = scannerInt.nextInt();
                findCarRim(cars, rimDiameter, tempCars);


                if (tempCars.size() > 0) {
                    carToSell = tempCars.get(0).clone();
                    System.out.println("Diese Model haben wir schon einmal verkauft!");
                } else {
                    cars.add(cars.get(0).clone());
                    cars.get(1).setType(model);
                    cars.get(1).setColor(color);
                    cars.get(1).setInterior(interior);
                    cars.get(1).setRimDiameter(rimDiameter);
                    carToSell = cars.get(cars.size() - 1).clone();
                    System.out.println("Sie haben ihr eigenes Auto konfiguriert!");
                }

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            System.out.println(carToSell);
        }
    }

    private static void findCarType(ArrayList<Car> cars, String setting, ArrayList<Car> tempCars) {
        if (tempCars.size() > 0) {
            for (int i = 0; i < tempCars.size(); i++) {
                if (!cars.get(i).getType().equals(setting)) {
                    tempCars.remove(i);
                }
            }
        }
    }

    private static void findCarColor(ArrayList<Car> cars, String setting, ArrayList<Car> tempCars) {
        if (tempCars.size() > 0) {
            for (int i = 0; i < tempCars.size(); i++) {
                if (!cars.get(i).getColor().equals(setting)) {
                    tempCars.remove(i);
                }
            }
        }
    }

    private static void findCarInterior(ArrayList<Car> cars, String setting, ArrayList<Car> tempCars) {
        if (tempCars.size() > 0) {
            for (int i = 0; i < tempCars.size(); i++) {
                if (!cars.get(i).getInterior().equals(setting)) {
                    tempCars.remove(i);
                }
            }
        }
    }
    private static void findCarRim(ArrayList<Car> cars, Integer setting, ArrayList<Car> tempCars) {
        if (tempCars.size() > 0) {
            for (int i = 0; i < tempCars.size(); i++) {
                if (cars.get(i).getRimDiameter() != setting) {
                    tempCars.remove(i);
                }
            }
        }
    }
}
