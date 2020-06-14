package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> set = new HashSet<>();
        for (String value : deps) {
            String start = "";
            int i = 0;
            for (String el : value.split("/")) {
                if (i == 0) {
                    i++;
                    start += el;
                    set.add(start);
                } else {
                    start = start + "/" + el;
                    set.add(start);
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepartmentDescComparator());
    }
}
