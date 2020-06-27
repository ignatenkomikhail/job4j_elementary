package ru.job4j.search;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class PriorityQueueTest {

    @Test
    public void whenPutQueue() {
        var queue = new PriorityQueue();
        queue.put(new Task("normal", 3));
        queue.put(new Task("realtime", 1));
        queue.put(new Task("high", 1));
        queue.put(new Task("low", 5));
        var task = queue.take();
        assertThat(task.getDesc(), is("realtime"));
    }
}
