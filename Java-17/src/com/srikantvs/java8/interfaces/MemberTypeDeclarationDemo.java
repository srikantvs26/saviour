package com.srikantvs.java8.interfaces;

interface Vehicle{
    void start();
    void stop();

    static void transportation(){
        System.out.println("Vehicles are used for transportation");
    }

    default void honking(){
        System.out.println("Vehicles honk!");
    }

    class Engine{ // It is understood that Engine is static. (implicitly)

        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Engine(String type) {
            this.type = type;
        }
    }
}

class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car is starting");
    }


    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    // If we define class called Engine it will be hiding not overriding.


}


public class MemberTypeDeclarationDemo{
    public static void main(String[] args) {
        
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();

        Vehicle.transportation();
        vehicle.honking();

        Vehicle.Engine engine = new Vehicle.Engine("Turbo");
        System.out.println(engine.getType());

    }
}