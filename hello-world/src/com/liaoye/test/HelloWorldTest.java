package com.liaoye.test;

public class HelloWorldTest {
    public static void main(String[] args) {
        World world = new World();
        world.show();
    }
}


class World {
    World(){
        System.out.println("调用了构造方法");
    }
    int b = 1;
    {
        System.out.println(b);
    }

    static int a = 0;
    static {
        System.out.println(a);
    }

    public void show() {
        System.out.println("调用了这个方法----");
    }

}

