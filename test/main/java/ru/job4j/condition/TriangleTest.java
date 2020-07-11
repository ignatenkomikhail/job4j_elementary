package main.java.ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

public class TriangleTest {
    @Test
    public void whenTriangleExist1() {
        Triangle trg = new Triangle(new Point(-1, 0), new Point(0, 3), new Point(2, 0));
        Assert.assertEquals(4.5, trg.area(), 0.01);
    }
    @Test
    public void whenTriangleExist2() {
        Triangle trg = new Triangle(new Point(1, 3), new Point(2, -5), new Point(-8, 4));
        Assert.assertEquals(35.5, trg.area(), 0.01);
    }
    @Test
    public void whenTriangleNotExist() {
        Triangle trg = new Triangle(new Point(1, 1), new Point(2, 2), new Point(3, 3));
        Assert.assertEquals(-1, trg.area(), 0.01);
    }
}
