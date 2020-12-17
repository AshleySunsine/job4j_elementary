package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void whenP6K2Then2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K1Then1() {
        int p = 7;
        int k = 1;
        double expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP364K80Then320() {
        int p = 364;
        int k = 80;
        double expected = 320;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}