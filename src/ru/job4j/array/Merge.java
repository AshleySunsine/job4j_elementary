package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftCount = 0, rightCount = 0, finalCount = 0;
        while ((leftCount < left.length) && (rightCount < right.length)) {
            if  (left[leftCount] < right[rightCount]) {
                rsl[finalCount] = left[leftCount];
                finalCount++; leftCount++;
            } else if (left[leftCount] >= right[rightCount]) {
                rsl[finalCount] = right[rightCount];
                finalCount++; rightCount++;
            }
        }
        while (leftCount < left.length) {
            rsl[finalCount] = left[leftCount];
            finalCount++; leftCount++;
        }
        while (rightCount < right.length) {
            rsl[finalCount] = right[rightCount];
            finalCount++; rightCount++;
        }
        return rsl;
    }
}