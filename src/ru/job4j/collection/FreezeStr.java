package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean rslt = true;
        if (left.length() == right.length()) {
            String[] a = left.split("");
            String[] b = right.split("");
            Map<String, Integer> map = new HashMap<>();
            for (String s : a) {
                Integer quantity = map.get(s);
                map.put(s, (quantity == null) ? 1 : ++quantity);
            }
            for (String s : b) {
                if (map.containsKey(s)) {
                    Integer quantity = map.get(s);
                    if (quantity > 1) {
                        map.put(s, --quantity);
                    } else {
                        map.remove(s);
                    }
                } else {
                    rslt = false;
                    break;
                }
            }
        } else {
            rslt = false;
        }
        return rslt;
    }
}
