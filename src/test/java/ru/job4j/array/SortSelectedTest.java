package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort5() {
        assertThat(SortSelected.sort(new int[]{8, 4, 6, 0, 2}), is(new int[]{0, 2, 4, 6, 8}));
    }
    @Test
    public void whenSort7() {
        assertThat(SortSelected.sort(new int[]{0, -3, 3, -2, 2, 1, -1}), is(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }
}
