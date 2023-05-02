package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to26then6() {
        double expected = 6;
        Point a = new Point(2, 0);
        Point b = new Point(2, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when82to26then7dot2() {
        double expected = 7.2;
        Point a = new Point(8, 2);
        Point b = new Point(2, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.02);
    }

    @Test
    public void when51to39then8dot2() {
        double expected = 8.2;
        Point a = new Point(5, 1);
        Point b = new Point(3, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.05);
    }

}