package com.company;

public class HelloWorld {
    public static void main(String[] args) {
        sayHello("Hello, World !!!");
    }

    static void sayHello(String msg) {
        System.out.println("Before method");
        sayGoodBye(msg);
        System.out.println("After method");
    }

    static void sayGoodBye(String msg){
        for (int i = 0; i < 10; ++i) {
            System.out.println(msg);
        }
    }
}
