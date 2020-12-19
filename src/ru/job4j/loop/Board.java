package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        int helper = 1;
        for (int indexH = 1; indexH <= height; indexH++) {
            for (int indexW = 1; indexW <= width; indexW++) {
                if (helper < 0) {
                    System.out.print(" ");
                    helper = helper * (-1);
                } else {
                    System.out.print("X");
                    helper = helper * (-1);
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);
    }
}
