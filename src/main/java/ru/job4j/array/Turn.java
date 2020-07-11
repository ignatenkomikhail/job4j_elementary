package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            SwitchArray.swap(array, i, array.length - 1 - i);
        }
        return array;
    }
}
