package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rte = value / 70;
        return rte;
    }

    public static int rubleToDollar(int value) {
        int rtd = value / 60; /* формула перевода рублей в доллары. */
        return rtd;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(350);
        int dollar = Converter.rubleToDollar(540);
        System.out.println("350 rubles are " + euro + " euro.");
        System.out.println("540 rubles are " + dollar + " dollars.");
    }
}