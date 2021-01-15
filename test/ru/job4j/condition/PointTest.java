package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when434To871Then75() {
        double expected = 75.6;
        Point a = new Point(43, 4);
        Point b = new Point(8, 71);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when512To226Then18() {
        double expected = 18.02;
        Point a = new Point(5, 12);
        Point b = new Point(22, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when675To329Then35() {
        double expected = 35.2;
        Point a = new Point(67, 5);
        Point b = new Point(32, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when888To138Then35() {
        double expected = 8.6;
        Point a = new Point(8, 8, 8);
        Point b = new Point(1, 3, 8);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.1);
    }

}