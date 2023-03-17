package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumTwoExpressions(double first, double second) {
        return minus(second, first) + devide(second, first);
    }

    public static double sumOfFourTransactions(double first, double second) {
        return sum(first, second) + multiply(first, second) + minus(second, first) + devide(second, first);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumTwoExpressions(10, 20));
        System.out.println("Результат расчета равен: " + sumOfFourTransactions(10, 20));
    }
}
