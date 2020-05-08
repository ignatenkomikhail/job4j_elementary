package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first && second > third) {
            result = second;
        }
        if (third > first) {
            result = third;
        }
        return result;
    }
}
