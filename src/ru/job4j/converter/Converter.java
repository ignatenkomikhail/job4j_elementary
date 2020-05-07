package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;  // формула перевода рублей в доллоры.
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        in = 240;
        expected = 4;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("240 rubles are 4. Test result : " + passed);
    }
}
