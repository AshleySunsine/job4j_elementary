package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{100}, {110, 120}, {130, 140, 150}, {160, 170, 180, 190}};
        for (int[] item : numbers) {
            System.out.println(
                    "Размер вложенного массива равен: " + item.length
            );
        }
    }
}