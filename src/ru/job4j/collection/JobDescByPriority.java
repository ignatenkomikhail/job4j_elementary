package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job a, Job b) {
        return Integer.compare(b.getPriority(), a.getPriority());
    }
}
