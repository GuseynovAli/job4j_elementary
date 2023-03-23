package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to26then6() {
        double expected = 6;
        int x1 = 2;
        int y1 = 0;
        int x2 = 2;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when82to26then7dot2() {
        double expected = 7.2;
        int x1 = 8;
        int y1 = 2;
        int x2 = 2;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.02);
    }

    @Test
    public void when51to39then8dot2() {
        double expected = 8.2;
        int x1 = 5;
        int y1 = 1;
        int x2 = 3;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.05);
    }

}