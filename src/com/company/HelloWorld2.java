package com.company;

public class HelloWorld2 {
    public static void main(String[] args) {
        allFunctions();
    }
    static void allFunctions() {
        System.out.println(function1() + " " + function2() + " " + function3());
    }
    static String function1() {
        return "function1";
    }
    static String function2() {
        return "function2";
    }
    static String function3() {
        return "function3";
    }
}