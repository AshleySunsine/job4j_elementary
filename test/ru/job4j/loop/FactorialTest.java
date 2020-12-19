

package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
       int expected = 120;
        int result = Factorial.calc(5);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int result = Factorial.calc(0);
        Assert.assertThat(result, is(expected));
    }
}

