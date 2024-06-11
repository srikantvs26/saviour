package constructors_and_super_keyword;

//The constructors of the subclass can initialize only the instance variables of the subclass. Thus, when a subclass object is instantiated the subclass object must also automatically execute one of the constructors of the superclass.

// Moreover, if the parent's constructor takes parameters, and it has no default constructor, you will need to call super() with argument(s) in subclass.

class Box {
    double length;
    double breadth;

    // No default constructor, so we have to call super() with arguments compulsarily.
    Box(double l, double b) {
        length = l;
        breadth = b;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double b, double h, double w) {
        // super(l, b); // to remove this error we have to pass l and b to superclass
        weight = w;
    }

    double area() {
        return length * breadth;
    }
}

public class ConstructorSuperDemo1 {

    public static void main(String[] args) {

    }

}
