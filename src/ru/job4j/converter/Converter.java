package ru.job4j.converter;

/**
 * Converter.
 *
 * @author Mikhail Ignatenko
 * @since 06.05.2020
 */
public class Converter {
    /**
     *
     * @param value The amount of the ruble.
     * @return The amount of the euro.
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     *
     * @param value The amount of the ruble.
     * @return The amount of the dollar.
     */
    public static int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Main.
     * @param args - args
     */
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
