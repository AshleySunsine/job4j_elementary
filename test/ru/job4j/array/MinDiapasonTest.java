package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat(
                MinDiapason.findMin(new int[] {45, 3, 34, -110}, 1, 3), is(-110)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                MinDiapason.findMin(new int[] {10, 5, 3, 1}, 1, 3), is(1)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {10, 2, 5, 1},
                        0, 2
                ),
                is(2)
        );
    }
}