package main.java.ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class JobTest {

    @Test
    public void whenJobAscByName() {
        int cmp = new JobAscByName().compare(new Job("c", 1), new Job("a", 3));
        assertThat(cmp, greaterThan(0));
    }

    @Test
    public void whenJobDescByName() {
        int cmp = new JobDescByName().compare(new Job("c", 1), new Job("a", 3));
        assertThat(cmp, lessThan(0));
    }

    @Test
    public void whenJobAscByPriority() {
        int cmp = new JobAscByPriority().compare(new Job("c", 1), new Job("a", 3));
        assertThat(cmp, lessThan(0));
    }

    @Test
    public void whenJobDescByPriority() {
        int cmp = new JobAscByName().compare(new Job("c", 1), new Job("a", 3));
        assertThat(cmp, greaterThan(0));
    }

    @Test
    public void whenCompareAscByNameDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("a", 2),
                new Job("b", 1),
                new Job("c", 3),
                new Job("b", 2),
                new Job("c", 1),
                new Job("a", 3)
        );
        Collections.sort(jobs, new JobAscByName().thenComparing(new JobDescByPriority()));
        assertThat(jobs, hasItems(
                new Job("a", 3),
                new Job("a", 2),
                new Job("b", 2),
                new Job("b", 1),
                new Job("c", 3),
                new Job("c", 1)
        ));
    }

    @Test
    public void whenCompareDescByNameAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("a", 2),
                new Job("b", 1),
                new Job("c", 3),
                new Job("b", 2),
                new Job("c", 1),
                new Job("a", 3)
        );
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobAscByPriority()));
        assertThat(jobs, hasItems(
                new Job("c", 1),
                new Job("c", 3),
                new Job("b", 1),
                new Job("b", 2),
                new Job("a", 2),
                new Job("a", 3)
        ));
    }
}
