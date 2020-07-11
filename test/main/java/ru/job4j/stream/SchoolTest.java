package main.java.ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.School;
import ru.job4j.stream.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void whenCollectLessThan50() {
        List<Student> students = List.of(
                new Student("Jack", 67),
                new Student("John", 39),
                new Student("Smit", 90),
                new Student("Garry", 51)
        );
        Predicate<Student> a = student -> student.getScore() > 0;
        Predicate<Student> b = student -> student.getScore() < 50;
        List<Student> out = School.collect(students, a.and(b));
        assertThat(out.get(0).getSurname(), is("John"));
    }

    @Test
    public void whenCollectBetween50And70() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 39));
        Student st1 = new Student("Jack", 67);
        students.add(st1);
        students.add(new Student("Smit", 90));
        Student st2 = new Student("Garry", 51);
        students.add(st2);
        Predicate<Student> a = student -> student.getScore() >= 50;
        Predicate<Student> b = student -> student.getScore() < 70;
        List<Student> out = School.collect(students, a.and(b));
        assertThat(out, hasItems(st1, st2));
    }

    @Test
    public void whenCollectMoreThan70() {
        List<Student> students = List.of(
                new Student("John", 39),
                new Student("Jack", 67),
                new Student("Smit", 90),
                new Student("Garry", 51)
        );
        Predicate<Student> a = student -> student.getScore() >= 70;
        Predicate<Student> b = student -> student.getScore() <= 100;
        List<Student> out = School.collect(students, a.and(b));
        assertThat(out.get(0).getSurname(), is("Smit"));
    }
}
