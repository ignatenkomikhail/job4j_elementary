package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job a, Job b) {
        return b.getName().compareTo(a.getName());
    }
}
