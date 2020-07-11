package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String rus = "Нeизвестное слово: " + eng;
        return rus;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        System.out.println(word.engToRus("word"));
    }
}
