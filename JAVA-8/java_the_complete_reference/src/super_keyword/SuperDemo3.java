package super_keyword;

// 1. Using super to access member of the superclass that has been hidden by member of subclass

class A {
    int i;
}

class B extends A {
    int i;// this hides i in A
    B(int x, int y){
        super.i = x;
        i = y;
    }

    void show(){
        System.out.println("i in superclass A :: "+super.i);
        System.out.println("i in subclass B :: "+i);
    }
}

public class SuperDemo3 {
    public static void main(String[] args) {
        
        B x = new B(34, 66);
        x.show();

    }
}
