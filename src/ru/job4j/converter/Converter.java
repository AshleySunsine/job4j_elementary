package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inEuro = 350;
        int inDollar = 540;
        int expectedEuro = 5;
        int expectedDollar = 9;
        int euro = Converter.rubleToEuro(inEuro);
        int dollar = Converter.rubleToDollar(inDollar);
        boolean passedEuro = expectedEuro == euro;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("350 rubles are " + euro + " euro. " + "Test result: " + passedEuro);
        System.out.println("540 rubles are " + dollar + " dollars. " + "Test result: " + passedDollar);
    }
}