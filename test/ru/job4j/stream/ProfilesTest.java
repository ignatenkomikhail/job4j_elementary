package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.hasItems;

public class ProfilesTest {

    @Test
    public void whenCollect() {
        List<Profile> profiles = new ArrayList<>();
        Address a1 = new Address("Briton", "Backstreet avenue", 357, 5);
        Address a2 = new Address("Portland", "NE33rd Drive", 7911, 12);
        profiles.add(new Profile(a1));
        profiles.add(new Profile(a2));
        List<Address> address = Profiles.collect(profiles);
        assertThat(address, hasItems(a1, a2));
    }
}
