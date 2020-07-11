package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixMap {

    public static List<Integer> collect(Integer[][] integers) {
        return Stream.of(integers)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}
