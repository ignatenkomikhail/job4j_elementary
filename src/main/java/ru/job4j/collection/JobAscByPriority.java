package ru.job4j.collection;

import java.util.Comparator;

public class JobAscByPriority implements Comparator<Job> {
    @Override
    public int compare(Job a, Job b) {
        return Integer.compare(a.getPriority(), b.getPriority());
    }
}
