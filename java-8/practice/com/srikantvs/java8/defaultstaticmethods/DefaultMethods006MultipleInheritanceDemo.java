package com.srikantvs.java8.defaultstaticmethods;

public class DefaultMethods006MultipleInheritanceDemo {

    public static void main(String[] args) {

        // One class can implement from multiple interfaces.

        Client123 client123 = new DefaultMethods006MultipleInheritanceDemo().new Client123();
        client123.methodA();
        client123.methodB();
        client123.methodC();
        
    }

    interface Interface1 {
        default void methodA() {
            System.out.println("inside method A");
        }
    }

    interface Interface2 {
        default void methodB() {
            System.out.println("inside method B");
        }
    }

    interface Interface3 {
        default void methodC() {
            System.out.println("inside method C");
        }
    }
    
    
    class Client123 implements Interface1, Interface2, Interface3{
        
    }

}
