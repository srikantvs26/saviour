package com.srikantvs.java8;
class Vehicle {

    public void wheels() {
        System.out.println("Vehicle has 4 Wheels");
    }

}

class Mercedez extends Vehicle {

    @Override
    public void wheels() {
        System.out.println("Mercedez Benz has 6 wheels");
    }
}

class Toyota extends Vehicle {

    @Override
    public void wheels() {
        System.out.println("Toyota has 8 wheels");
    }

    public void drive() {
        System.out.println("Toyota Vehicle is driving.");
    }
}

public class DynamicMethodDispatchDemo {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Mercedez mercedez = new Mercedez();
        Toyota toyota = new Toyota();

        vehicle.wheels();
        mercedez.wheels();
        toyota.wheels();

        // Dynamic Method dispatch
        System.out.println("================================================");
        Vehicle v1 = new Mercedez();
        v1.wheels();

        v1 = new Toyota();
        v1.wheels();

        // v1.drive(); The method drive() is undefined for the type Vehicle

        // A b = (C)d;
        Object o = (Vehicle) mercedez;

        //ClassCastException
        // Mercedez mx = (Mercedez)v1;
        Vehicle mx1 = (Mercedez)v1; //v1 is Toyota see clearly
    }

}
