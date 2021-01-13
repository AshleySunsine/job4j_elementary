package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = index * index;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(6);
        System.out.println("Out only even: ");
        System.out.println(array[0]);
        for (int index = 2; index < array.length; index += 2) {
            System.out.println(array[index]);
        }
    }
}
