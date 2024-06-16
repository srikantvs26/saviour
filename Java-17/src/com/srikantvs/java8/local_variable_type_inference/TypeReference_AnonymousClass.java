package com.srikantvs.java8.local_variable_type_inference;

interface Vehicle{
    void start(); // its public static and abstract implicitly
}



public class TypeReference_AnonymousClass {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle() {
            @Override
            public void start(){
                System.out.println("Vehicle starting");
            }
        };

        vehicle.start();


        var vehicle2 = new Vehicle() {
            @Override
            public void start(){
                System.out.println("Vehicle starting again");
            }
        };

        vehicle2.start();
    }
}
