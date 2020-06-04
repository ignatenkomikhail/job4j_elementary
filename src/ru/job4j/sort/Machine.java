package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] result = new int[100];
        int size = 0;
        money -= price;
        for (int coin : this.coins) {
            while (money - coin >= 0) {
                money -= coin;
                result[size++] = coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
