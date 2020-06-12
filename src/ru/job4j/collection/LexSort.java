package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int i = 0;
        StringBuffer a = new StringBuffer();
        StringBuffer b = new StringBuffer();
        while (i < left.length()) {
            if (left.charAt(i) >= '0' && left.charAt(i) <= '9') {
                a.append(left.charAt(i));
                i++;
            } else {
                i = 0;
                break;
            }
        }
        while (i < right.length()) {
            if (right.charAt(i) >= '0' && right.charAt(i) <= '9') {
                b.append(right.charAt(i));
                i++;
            } else {
                break;
            }
        }
        return Integer.parseInt(a.toString()) - Integer.parseInt(b.toString());
    }
}
