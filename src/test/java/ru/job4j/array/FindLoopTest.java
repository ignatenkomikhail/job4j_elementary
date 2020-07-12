package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas7NotFound() {
        FindLoop find = new FindLoop();
        assertThat(find.indexOf(new int[]{3, 5, 12, 9}, 7), is(-1));
    }
    @Test
    public void whenArrayHas9Then3() {
        FindLoop find = new FindLoop();
        assertThat(find.indexOf(new int[]{4, 2, 40, 9, 18}, 9), is(3));
    }
    @Test
    public void whenRangeArray9NotFound() {
        FindLoop find = new FindLoop();
        assertThat(find.indexOf(new int[]{1, 2, 3, 4, 5, 6, 7}, 9, 2, 5), is(-1));
    }
    @Test
    public void whenRangeArray5Then4() {
        FindLoop find = new FindLoop();
        assertThat(find.indexOf(new int[]{1, 2, 3, 4, 5, 6, 7}, 5, 2, 5), is(4));
    }
}
