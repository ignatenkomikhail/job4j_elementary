package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void whenFindPerson() {
        var pd = new PhoneDictionary();
        pd.add(
                new Person("John", "Doe", "555-00-11", "Tinseltown")
        );
        ArrayList<Person> persons = pd.find("el");
        assertThat(persons.get(0).getName(), is("John"));
    }

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
