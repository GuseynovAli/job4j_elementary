package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int third, int forth) {
        return max(first, max(third, forth, first));
    }
}
