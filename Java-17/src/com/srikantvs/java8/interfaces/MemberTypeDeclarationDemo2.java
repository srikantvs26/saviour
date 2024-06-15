package com.srikantvs.java8.interfaces;

import com.srikantvs.java8.interfaces.Car2.Brake;

interface Vehicle2 {

    void start();

    void stop();

    default void honking() {
        System.out.println("Vehicle Honking");
    }

    class Brake {
        String type = "ABS";

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

}

class Car2 implements Vehicle2 {

    @Override
    public void start() {
        System.out.println("Car2 starting");
    }

    @Override
    public void stop() {
        System.out.println("Car2 stopping");
    }

    class Brake {
        String type = "Modern Brakes";

        public String getType() {
            return type;
        }
    }

}

public class MemberTypeDeclarationDemo2 {

    public static void main(String[] args) {

        Vehicle2 vehicle2 = new Car2();
        vehicle2.start();
        vehicle2.stop();
        vehicle2.honking();

        // when Brake is static
        // Car2.Brake bx = new Car2.Brake();
        // Brake bx2 = new Car2.Brake();
        // System.out.println(bx.getType());

        // when Brake is non static
        Car2.Brake brake3 = new Car2().new Brake();
        Brake brake = new Car2().new Brake();
        System.out.println(brake.getType());

    }

}
