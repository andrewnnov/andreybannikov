package ru.job4j.search;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName(){
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "53742","Bryansk"));
        List<Person> person = phones.find("Petr");
        assertThat(person.iterator().next().getSurname(), is("Arsentev"));
    }

}
