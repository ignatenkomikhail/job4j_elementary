package ru.job4j.stragery;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenDrawSqr() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Sqr());
        assertThat(
                new String(out.toByteArray()),
                 is(
                        new StringJoiner(System.lineSeparator())
                                .add("*******")
                                .add("*     *")
                                .add("*     *")
                                .add("*******")
                                .add("")
                                .toString()
                )
        );
        System.setOut(stdout);
    }
    @Test
    public void whenDrawTrngl() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Trngl());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("   *   ")
                                .add("  * *  ")
                                .add(" *   * ")
                                .add("*******")
                                .add("")
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}
