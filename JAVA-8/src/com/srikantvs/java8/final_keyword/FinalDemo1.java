package final_keyword;

import java.util.Date;

class A {
    public void greetings() {
        System.out.println("Hello, World");
    }

    // using final to prevent overriding of getTodayDate() method
    final public Date getTodayDate() {
        return new Date();
    }
}

class B extends A {
    // greetings method can be overidden
    @Override
    public void greetings() {
        System.out.println("Good Morning!");
    }

    @Override
    public Date getTodayDate() { // Cannot override the final method from A
        return new Date();
    }

}

public class FinalDemo1 {
    public static void main(String[] args) {
        final double PI = 3.14; // using final to create named constant
        System.out.println(PI);

        PI = 4; // Compile Error
    }
}
