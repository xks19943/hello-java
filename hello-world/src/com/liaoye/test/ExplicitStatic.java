package com.liaoye.test;

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}
class Cups {
    static Cup c1;
    static Cup c2;
    static {
        c1 = new Cup(1);
        c2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }
}
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.c1.f(99); // (1)
    }
    static Cups x = new Cups(); // (2)
    static Cups y = new Cups(); // (2)
} ///:~


/**
 * Cup(1)
 * Cup(2)
 * Cups()
 * Cups()
 * Inside main()
 * f(99)
 * */