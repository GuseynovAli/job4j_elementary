package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char currentSymbol = input.charAt(0);
        int counter = 1;

        if (input.length() == 1) {
            return input;
        }

        for (int i = 1; i < input.length(); i++) {
            char nextSymbol = input.charAt(i);

            if (currentSymbol == nextSymbol) {
                counter++;
            } else {
                result += getCurrentSymbolCount(currentSymbol, counter);
                currentSymbol = nextSymbol;
                counter = 1;
            }
        }

        result += getCurrentSymbolCount(currentSymbol, counter);

        return result;
    }

    public static String getCurrentSymbolCount(char currentSymbol, int counter) {
        if (counter == 1) {
            return String.valueOf(currentSymbol);
        }

        return currentSymbol + Integer.toString(counter);
    }
}