package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenPoint() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        Assert.assertEquals(1.41, a.distance(b), 0.01);
    }

    @Test
    public void whenPoint3D() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        Assert.assertEquals(1.73, a.distance3D(b), 0.01);
    }
}
