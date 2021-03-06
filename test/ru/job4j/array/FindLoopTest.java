package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas35Then11() {
        int[] input = {54, 43, 34, 6, 7, 3, 2, 5, 7, 42, 57, 35};
        int value = 35;
        int result = FindLoop.indexOf(input, value);
        int expect = 11;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas50ThenMinusOne() {
        int[] input = {51, 4, 32, 2, 54, 43, 34, 6, 7, 3, 28, 5, 7, 42, 57, 35};
        int value = 50;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind10At() {
        int[] input = new int[] {1, 2, 45, 90, 7, 3, 78, 34, 10, 12, 76, 45, 23, 3};
        int value = 10;
        int start = 3;
        int finish = 12;
        int result = FindLoop.indexOf(input, value, start, finish);
        assertThat(result, is(8));
    }

    @Test
        public void whenDontFind555At() {
        int[] input = new int[] {1, 2, 45, 90, 7, 3, 78, 34, 10, 12, 76, 45, 23, 3};
        int value = 555;
        int start = 3;
        int finish = 11;
        int result = FindLoop.indexOf(input, value, start, finish);
        assertThat(result, is(-1));
    }
}