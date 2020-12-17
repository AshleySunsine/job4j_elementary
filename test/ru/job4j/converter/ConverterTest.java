package ru.job4j.converter;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert350RblThen5Euro() {
        int in = 350;
        int expected = 5;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert540RblThen9Dollars() {
        int in = 540;
        int expected = 9;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}