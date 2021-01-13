package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        /**
         * temp - переменная для временного хранения значение ячейки с индексом 0.
         */
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        for (int item : array) {
            System.out.println(item);
        }
    }
}