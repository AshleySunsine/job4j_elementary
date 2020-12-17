package ru.job4j.calculate;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        System.out.println(X2.calc(1, 1, 1, 1));
        System.out.println(X2.calc(0, 1, 1, 1));
        System.out.println(X2.calc(1, 1, 0, 1));
        System.out.println(X2.calc(1, 1, 1, 0));
    }
}
