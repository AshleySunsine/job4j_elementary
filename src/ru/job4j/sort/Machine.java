package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int sdacha = money - price;
        int size = 0;
        for (int num : coins) {
            for (int index = 0; index < rsl.length; index++) {
                if ((sdacha - num) < 0) {
                    size = size + index;
                    break;
                } else if ((sdacha - num) > 0) {
                    rsl[size + index] = num;
                    sdacha = sdacha - num;
                } else if ((sdacha - num) == 0) {
                    rsl[size + index] = num;
                    sdacha = sdacha - num;
                }
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}