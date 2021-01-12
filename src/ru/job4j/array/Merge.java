package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = 0, b = 0, c = 0;
        while ((a < left.length) && (b < right.length)) {
            if  (left[a] < right[b]) {
                rsl[c] = left[a];
                c++; a++;
            } else if (left[a] >= right[b]) {
                rsl[c] = right[b];
                c++; b++;
            }
        }

        while (a < left.length) {
            rsl[c] = left[a];
            c++; a++;
        }

        while (b < right.length) {
            rsl[c] = right[b];
            c++; b++;
        }

        return rsl;
    }
}