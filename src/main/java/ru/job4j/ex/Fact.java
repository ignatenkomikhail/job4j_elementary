package ru.job4j.ex;

public class Fact {

    public static void main(String[] args) {
        System.out.println(new Fact().calc(-7));
    }

    public int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("The value of the argument must be positive");
        }
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
