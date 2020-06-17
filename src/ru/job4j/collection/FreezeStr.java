package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean rslt = true;
        List<String> list = new ArrayList<>(Arrays.asList(left.split("")));
        String[] array = right.split("");
        for (String s : array) {
            if (!list.remove(s)) {
                rslt = false;
                break;
            }
        }
        return rslt;
    }
}
