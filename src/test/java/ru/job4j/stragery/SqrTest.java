package ru.job4j.stragery;

import org.junit.Test;

import java.util.StringJoiner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SqrTest {
    @Test
    public void whenDraw() {
        Sqr s = new Sqr();
        assertThat(s.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("*******")
                                .add("*     *")
                                .add("*     *")
                                .add("*******")
                                .toString()
                )
        );
    }
}
