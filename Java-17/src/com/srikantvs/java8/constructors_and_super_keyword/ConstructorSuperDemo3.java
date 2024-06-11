package constructors_and_super_keyword;

class Box {
    double length;
    double breadth;

    // already we have default constructor here.
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double b, double h, double w) {
        // compiler automatically inserts super() here.
        weight = w;
    }

    double area() {
        return length * breadth;
    }
}

public class ConstructorSuperDemo3 {

    public static void main(String[] args) {

    }

}
