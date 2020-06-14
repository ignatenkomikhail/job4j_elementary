package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentDescComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int cmp = 0;
        String[] one = a.split("/");
        String[] two = b.split("/");
        int i = 0;
        while (i < one.length && i < two.length) {
            if (i == 0) {
                cmp = two[i].compareTo(one[i]);
                i++;
                if (cmp != 0) {
                    break;
                }
            } else {
                cmp = one[i].compareTo(two[i]);
                i++;
                if (cmp != 0) {
                    break;
                }
            }
        }
        if (cmp == 0) {
            cmp = one.length - two.length;
        }
        return cmp;
    }
}
