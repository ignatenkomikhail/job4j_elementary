package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> rslt = new ArrayList<>();
        while (it.hasNext()) {
            Iterator<Integer> iter = it.next();
            while (iter.hasNext()) {
                rslt.add(iter.next());
            }
        }
        return rslt;
    }
}
