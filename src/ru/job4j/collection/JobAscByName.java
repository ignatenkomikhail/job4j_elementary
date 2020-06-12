package ru.job4j.collection;

import java.util.Comparator;

public class JobAscByName implements Comparator<Job> {
    @Override
    public int compare(Job a, Job b) {
        return a.getName().compareTo(b.getName());
    }
}
