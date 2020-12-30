package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int sdacha = money - price;
        int size = 0;
        for (int num : coins) {
                while (sdacha - num >= 0) {
                    rsl[size++] = num;
                    sdacha = sdacha - num;
                }
                    }
        return Arrays.copyOf(rsl, size);
    }
}