package ru.job4j.stragery;

import java.util.StringJoiner;

public class Trngl implements Shape {
    @Override
    public String draw() {
        StringJoiner sj = new StringJoiner(System.lineSeparator());
              sj.add("   *   ")
                .add("  * *  ")
                .add(" *   * ")
                .add("*******");
        return sj.toString();
    }
}
