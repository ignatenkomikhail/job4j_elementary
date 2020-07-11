package main.java.ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Square;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound5Then014916() {
        assertThat(Square.calculate(5), is(new int[]{0, 1, 4, 9, 16}));
    }
}
