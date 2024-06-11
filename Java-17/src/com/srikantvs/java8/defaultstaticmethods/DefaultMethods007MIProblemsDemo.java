package com.srikantvs.java8.defaultstaticmethods;

public class DefaultMethods007MIProblemsDemo {

    public static void main(String[] args) {

        // One class can implement from multiple interfaces.
        // What if both interfaces have same methods name that we will resolve

        ClientSol client123 = new DefaultMethods007MIProblemsDemo().new ClientSol();
        client123.methodA();

        ClientZol clientZol = new DefaultMethods007MIProblemsDemo().new ClientZol();
        clientZol.methodA();

    }

    interface Dogs {
        default void methodA() {
            System.out.println("inside dogs method A");
        }
    }
    // same methods are there.
    interface Cat {
        default void methodA() {
            System.out.println("inside cat  method A");
        }
    }

    // Sol 1. : Overrride that method itself.
    class ClientSol implements Dogs, Cat {
        public void methodA() {
            System.out.println("inside generic method A");
        }
    }

    // Sol 2. : Override that method, but call which version you want to call
    // explicitly.
    class ClientZol implements Dogs, Cat {
        public void methodA() {
            Cat.super.methodA();
        }
    }

}
