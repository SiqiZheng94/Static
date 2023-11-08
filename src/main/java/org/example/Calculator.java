package org.example;

public class Calculator {
    private int a;
    private int b;

    public Calculator() {
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static int add(int a, int b){
        return a + b;
        //return this.a + this.b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static int division(int a, int b){
        return a / b;
    }
}
