package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(7, 3, 1);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(7, 3, 76);
        assertThat(result, is(76));
    }

    @Test
    public void whenAllEqual() {
        int result = MultiMax.max(23, 23, 23);
        assertThat(result, is(23));
    }
}