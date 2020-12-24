package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static ru.job4j.array.EqLast.check;
import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void checkTrue() {
       int[] input1 = new int[] {1, 3, 6, 7, 2, 4};
       int[] input2 = new int[] {2, 3, 4};
       boolean out = EqLast.check(input1, input2);
       assertThat(out, is(true));
    }

    @Test
    public void checkFalse() {
        int[] input1 = new int[] {1, 3, 6, 7, 2, 8};
        int[] input2 = new int[] {2, 3, 21};
        boolean out = EqLast.check(input1, input2);
        assertThat(out, is(false));
    }

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertThat(check(left, right), is(true));
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        assertThat(check(left, right), is(false));
    }
}