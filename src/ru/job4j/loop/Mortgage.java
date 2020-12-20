package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double remains = amount;
        while (remains > 0) {
            year++;
            remains = (remains + (remains * (percent / 100))) - salary;
        }
        return year;
    }
}