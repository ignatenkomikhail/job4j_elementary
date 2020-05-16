package ru.job4j.condition;

public class Max {

    public static int max(int one, int two) {
        return (one > two) ? one : two;
    }

    public static int max(int one, int two, int three) {
        return (three > Max.max(one, two)) ? three : Max.max(one, two);
    }

    public static int max(int one, int two, int three, int four) {
        return (four > Max.max(one, two, three)) ? four : Max.max(one, two, three);
    }
}
