package main.java.ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFrom10To90Then2050() {
        assertThat(Counter.sumByEven(10, 90), is(2050));
    }
    @Test
    public void whenSumEvenNumbersFrom100To500Then60300() {
        assertThat(Counter.sumByEven(100, 500), is(60300));
    }
}
