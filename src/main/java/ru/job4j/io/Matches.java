package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int gamer = 1;
        int matches = 11;
        int step;
        String str;
        System.out.println("o==============");
        System.out.println(" Игра \"Спички\"");
        System.out.println("==============o");
        while (run) {
            System.out.println("\nНа столе " + matches + " спичек");
            str = (gamer == 1) ? "Ход 1-го игрока:" : "Ход 2-го игрока:";
            System.out.println(str);
            step = Integer.parseInt(scan.nextLine());
            if (step > 0 && step <= 3 && (matches - step >= 0)) {
                matches -= step;
                gamer = (gamer == 1) ? 2 : 1;
            }
            if (matches == 0) {
                run = false;
                str = (gamer == 2) ? "Победил 1-й игрок!" : "Победил 2-й игрок!";
                System.out.println("------------------");
                System.out.println(str);
            }
        }
    }
}
