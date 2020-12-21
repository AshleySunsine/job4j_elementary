package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        System.out.println("Массив ages " + ages.length);
        System.out.println("Массив surnames " + surnames.length);
        System.out.println("Массив prices " + prices.length);
        names[0] = "John Smith";
        names[1] = "Devid Jonson";
        names[2] = "Bred Pit";
        names[3] = "Alice Cooper";
        for (int i = 0; i < (names.length); i++) {
            System.out.println(names[i]);
        }
    }
}
