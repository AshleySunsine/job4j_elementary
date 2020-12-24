package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        if (array.length % 2 == 0) {
            for (int index = 0; index < (array.length / 2); index++) {
                temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            }
            return array;
        }
        for (int index = 0; index < ((int) (array.length / 2)); index++) {
            temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}