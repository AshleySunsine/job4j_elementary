package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int indexNull = 0; indexNull < array.length; indexNull++) {
            if (array[indexNull] == null) {
                /*В наших курсах мы не используем обратную проходку по массиву.
                Я помню. Но здесь она нужна!
                 */

                /* Warning! REVERSE driving through the array!!! */
                for (int notNullIndex = array.length - 1; notNullIndex != indexNull; notNullIndex--) {
                    if (array[notNullIndex] != null) {
                        Defragment.swap(array, indexNull, notNullIndex);
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