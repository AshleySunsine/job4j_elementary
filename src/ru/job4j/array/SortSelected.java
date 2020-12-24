package ru.job4j.array;
import ru.job4j.array.Min.*;
import ru.job4j.array.FindLoop.*;
import ru.job4j.array.MinDiapason.*;

public class SortSelected {
    public static int[] sort(int[] data) {
        int finalIndex = data.length - 1;
        int temp;
        for (int index = 0; index < data.length; index++) {
            int minIndex = FindLoop.indexOf(data, MinDiapason.findMin(data, index, finalIndex), index, finalIndex);
            temp = data[index];
            data[index] = data[minIndex];
            data[minIndex] = temp;
        }
        return data;
    }
}
