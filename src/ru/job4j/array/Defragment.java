package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int indexNull = 0; indexNull < array.length; indexNull++) {
            if (array[indexNull] == null) {
                for (int notNullIndex = indexNull; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {
                        Defragment.swap(array, indexNull, notNullIndex);
                        break;
                    }
                }
            }
            System.out.println();
            for (String line : array) {
                System.out.print(line + " ");
            }

        }
        return array;
    }

    public static String[] swap(String[] array, int nullIndex, int notNullIndex) {
        String temp = array[notNullIndex];
        array[notNullIndex] = array[nullIndex];
        array[nullIndex] = temp;
        return array;
    }

    public static void main(String[] args) {
        String[] input = {null, "Two", null, "tiny", "tigers", null, "take", "the", null, "taxi", "to", "town"};
        String[] compressed = compress(input);
        System.out.println();
        for (String line : compressed) {
            System.out.print(line + " ");
        }
    }
}