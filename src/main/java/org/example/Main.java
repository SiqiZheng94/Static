package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JavaStatic test1 = new JavaStatic();
        JavaStatic test2 = new JavaStatic();
        JavaStatic test3 = new JavaStatic();

        JavaStatic.incrementTotalCount();

        test1.incrementInstanceCount();
        test2.incrementInstanceCount();
        test2.incrementInstanceCount();

        System.out.println(test1.toString());
        System.out.println(test2.toString());


        System.out.println("-----------------");

        System.out.println(Calculator.add(4, 2));
        System.out.println(Calculator.subtraction(4,2));
        System.out.println(Calculator.multiplication(4,2));
        System.out.println(Calculator.division(4,2));
    }
}