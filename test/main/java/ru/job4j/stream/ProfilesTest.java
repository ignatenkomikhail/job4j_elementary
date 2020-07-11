package main.java.ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.Address;
import ru.job4j.stream.Profile;
import ru.job4j.stream.Profiles;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void whenCollect() {
        List<Profile> profiles = new ArrayList<>();
        List<Address> expected = new ArrayList<>();
        Address a1 = new Address("Briton", "Backstreet avenue", 357, 5);
        Address a2 = new Address("Portland", "NE33rd Drive", 7911, 12);
        profiles.add(new Profile(a1));
        profiles.add(new Profile(a2));
        List<Address> address = Profiles.collect(profiles);
        expected.add(a1);
        expected.add(a2);
        assertThat(address, is(expected));
    }

    @Test
    public void whenCollectWithSortedAndDistincted() {
        List<Profile> profiles = new ArrayList<>();
        List<Address> expected = new ArrayList<>();
        Address a1 = new Address("Portland", "NE33rd Drive", 7911, 10);
        Address a2 = new Address("Briton", "Backstreet avenue", 357, 5);
        Address a3 = new Address("Brooklyn", "Coney Island avenue", 3172, 3);
        Address a4 = new Address("Briton", "Backstreet avenue", 357, 14);
        Address a5 = new Address("Portland", "NE33rd Drive", 7911, 12);
        profiles.add(new Profile(a1));
        profiles.add(new Profile(a2));
        profiles.add(new Profile(a3));
        profiles.add(new Profile(a4));
        profiles.add(new Profile(a5));
        List<Address> address = Profiles.collect(profiles);
        expected.add(a2);
        expected.add(a3);
        expected.add(a1);
        assertThat(address, is(expected));
    }
}
