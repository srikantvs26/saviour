package com.srikantvs.java8.interfaces;

interface A {

    // ============================abstract instance method
    // declarations=====================
    void show();

    abstract void show2();

    public abstract void show3();

    // ============================default method declarations======================
    // we can override them later
    default void show4() {
        System.out.println("show4");
    }

    public default void show5() {
        System.out.println("show5");
    }

    // ====================static method declarations========================
    static void show6() {
        System.out.println("show6");
    }

    public static void show7() {
        System.out.println("show7");
    }

    // ==============private instance method declarations=====================
    private void show8() {
        System.out.println("show8");
    }

    // ============== private static method declarations =====================
    private static void show9() {
        System.out.println("show9");
    }

    // =================== constants======================================
    double PI = 3.14;
    public static final double PI2 = 3.14;

    // ===================member type declarations example you see=========
}

public class InterfacesAllCombo {

}
