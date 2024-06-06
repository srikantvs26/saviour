package method_hiding;
class Animal {
    public static void sound() {
        System.out.println("animal makes sound");
    }
}

class Dog extends Animal {

    public static void sound() {
        System.out.println("dog barks!");
    }
}

public class MethodHidingDemo {

    public static void main(String[] args) {

        Dog.sound();// it hides static method in Animal class, being static methods with same
                    // signature the sound method of Animal cannot be overridden.
                    
        Animal.sound();

    }

}
