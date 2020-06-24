package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentMapTest {

    @Test
    public void whenCollect() {
        Student std1 = new Student("Ivanov", 39);
        Student std2 = new Student("Petrov", 45);
        Student std3 = new Student("Ivanov", 46);
        Student std4 = new Student("Petrov", 74);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Ivanov", std1);
        expected.put("Petrov", std2);
        List<Student> students = Arrays.asList(std1, std2, std3, std4);
        Map<String, Student> map = StudentMap.collect(students);
        assertThat(map, is(expected));
    }
}
