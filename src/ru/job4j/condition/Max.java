package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return Max.max(third, Max.max(first, second));
    }

    public static int max(int first, int second, int third, int fours) {
        return Max.max(fours, Max.max(first, second, third));
    }
}