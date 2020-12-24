package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Min.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinTest {
    @Test
    public void minFirst() {
        assertThat(Min.findMin(new int[] {0, 5, 6, 2 }), is(0));
    }

    @Test
    public void minFinis() {
        assertThat(Min.findMin(new int[] {5, 6, 7, 8, 4, 3, 1, 0, -34}), is(-34));
    }

    @Test
    public void minMiddle() {
        assertThat(Min.findMin(new int[] {45, 67, 34, 2, 43, 89, 100}), is(2));
    }
}