package ru.job4j.loop;

/**
 * Slash.
 *
 * @author Mikhail Ignatenko
 * @since 09.05.2020
 */
public class Slash {

    /**
     *
     * @param size Field size.
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = cell == row;
                boolean right = cell + row == size - 1;
                if (left || right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Main.
     * @param args - args
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 7");
        draw(7);
    }
}