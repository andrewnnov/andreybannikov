package ru.Zlatopolskiy.Task8_14October;

import org.junit.Test;
import ru.Zlatopolskiy.Task8_14october.Task9_166;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Task9_166Test {

    @Test
    public void whenCat_DogThenDog_Cat() {
        Task9_166 task = new Task9_166();
        assertEquals("Dog Cat", task.exchangeWordInSentence("Cat Dog"));
        System.out.println(task.exchangeWordInSentence("Cat Dog"));
    }

    @Test
    public void whenMamaThenRamu() {
        Task9_166 task = new Task9_166();
        assertEquals("раму мыла мама", task.exchangeWordInSentence("мама мыла раму"));
        System.out.println(task.exchangeWordInSentence("Мама мыла раму"));
    }
}
