package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentDescComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        String[] one = a.split("/");
        String[] two = b.split("/");
        int cmp = two[0].compareTo(one[0]);
        return (cmp == 0) ? a.compareTo(b) : cmp;
    }
}
