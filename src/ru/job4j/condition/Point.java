package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println(" ");
        result = Point.distance(43, 4, 8, 71);
        System.out.println("result (43, 4) to (8, 71) " + result);
        System.out.println(" ");
        result = Point.distance(5, 12, 22, 6);
        System.out.println("result (5, 12) to (22, 6) " + result);
    }
}