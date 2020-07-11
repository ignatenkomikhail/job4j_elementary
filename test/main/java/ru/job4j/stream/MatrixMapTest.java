package main.java.ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.MatrixMap;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixMapTest {

    @Test
    public void whenCollect() {
        Integer[][] integers = new Integer[][] {
                {1, 2, 3},
                {4, 5, 6}
        };
        List<Integer> out = MatrixMap.collect(integers);
        assertThat(out, is(List.of(1, 2, 3, 4, 5, 6)));
    }
}
