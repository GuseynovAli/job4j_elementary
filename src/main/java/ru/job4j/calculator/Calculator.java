package ru.job4j.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int third = first + second;
        System.out.println(third);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}
