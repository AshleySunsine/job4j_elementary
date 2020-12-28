package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void multiple6x6() {
        int[][] outTable = Matrix.multiple(6);
        int[][] expect = {{1, 2, 3, 4, 5, 6},
                          {2, 4, 6, 8, 10, 12},
                          {3, 6, 9, 12, 15, 18},
                          {4, 8, 12, 16, 20, 24},
                          {5, 10, 15, 20, 25, 30},
                          {6, 12, 18, 24, 30, 36}};
        assertThat(expect, is(outTable));
    }

    @Test
    public void multiple3x3() {
        int[][] outTable = Matrix.multiple(3);
        int[][] expect = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        assertThat(expect, is(outTable));
        }
    }
