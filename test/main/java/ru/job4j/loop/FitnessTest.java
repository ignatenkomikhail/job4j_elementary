package main.java.ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Fitness;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.calc(95, 90);
        assertThat(month, is(0));
    }
    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));
    }
    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(50, 90);
        assertThat(month, is(2));
    }
    @Test
    public void whenIvanEqNik() {
        int month = Fitness.calc(90, 90);
        assertThat(month, is(1));
    }
}
