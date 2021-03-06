package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        result1 = SqArea.square(7, 1);
        System.out.println(" p = 7, k = 1, s = 1, real = " + result1);
        result1 = SqArea.square(364, 80);
        System.out.println(" p = 364, k = 80, s = 320, real = " + result1);
    }
}