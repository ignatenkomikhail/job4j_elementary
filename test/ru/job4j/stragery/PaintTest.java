package ru.job4j.stragery;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("Reassigning the output to Byte Array.");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("Reassigning the output to \"standard\" output stream.");
    }
    @Test
    public void whenDrawSqr() {
        new Paint().draw(new Sqr());
        assertThat(
                this.out.toString(),
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
    }
    @Test
    public void whenDrawTrngl() {
        new Paint().draw(new Trngl());
        assertThat(
                this.out.toString(),
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
    }
}
