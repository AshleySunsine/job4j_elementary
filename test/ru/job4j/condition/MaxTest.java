package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To0To3Then4() {
        int result = Max.max(4, 0, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax6To6To5To4Then6() {
        int result = Max.max(6, 6, 5, 4);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax6To1To8To4Then8() {
        int result = Max.max(6, 1, 8, 4);
        assertThat(result, is(8));
    }

}