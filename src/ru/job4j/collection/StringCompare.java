package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int cmp = 0;
        int i = 0;
        while (i < a.length() && i < b.length()) {
            cmp = a.charAt(i) - b.charAt(i);
            i++;
            if (cmp != 0) {
                break;
            }
        }
        if (cmp == 0) {
            cmp = Integer.compare(a.length(), b.length());
        }
        return cmp;
    }
}
