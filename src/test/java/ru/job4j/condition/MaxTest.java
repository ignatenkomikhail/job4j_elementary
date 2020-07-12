package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax12Then2() {
        assertThat(Max.max(1, 2), is(2));
    }
    @Test
    public void whenMax123Then3() {
        assertThat(Max.max(1, 2, 3), is(3));
    }
    @Test
    public void whenMax1234Then4() {
         assertThat(Max.max(1, 2, 3, 4), is(4));
    }
}
