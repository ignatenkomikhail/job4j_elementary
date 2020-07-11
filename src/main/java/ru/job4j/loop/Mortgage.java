package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 1;
        double debt = amount + (amount * percent / 100);

        while (debt > salary) {
            debt -= salary;
            debt = debt + (debt * percent / 100);
            year++;
        }
        return year;
    }
}
