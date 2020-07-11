package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ivan@yandex.ru", "Ivanov Ivan");
        map.put("sergey@mail.ru", "Filimonov Sergey");
        map.put("sven@gmail.ru", "Svenson Sven");
        map.put("ivan@yandex.ru", "Sidorov Ivan");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }
        System.out.println();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
