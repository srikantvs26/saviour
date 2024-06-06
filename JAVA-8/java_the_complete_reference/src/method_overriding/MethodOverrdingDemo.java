package method_overriding;
class Animal {
    public  void sound() {
        System.out.println("animal makes sound");
    }
}

class Dog extends Animal {

    public  void sound() {
        System.out.println("dog barks!");
    }
}

public class MethodOverrdingDemo {

    public static void main(String[] args) {

        Animal a = new Animal();
        Dog d = new Dog();
        Animal a2 = new Dog();
        Animal a3 = null;// in static method if we call method on a3 it works there. here its NPE


        a.sound();
        d.sound();
        a2.sound();
        a3.sound();


    }

}
