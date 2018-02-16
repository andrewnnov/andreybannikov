package ru.job4j.part1_test;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class WordInWordTest {

    @Test
    public void whenStringContainsIngThenTrue(){
        WordInWord wordInWord = new WordInWord();
        boolean result = wordInWord.contains("String", "ing");
        assertThat(result, is(true));
    }

    @Test
    public void whenStringNotContainsWord(){
        WordInWord wordInWord = new WordInWord();
        boolean result = wordInWord.contains("String", "poni");
        assertThat(result, is(false));
    }

    @Test
    public void whenStringContainsString(){
        WordInWord wordInWord = new WordInWord();
        boolean result = wordInWord.contains("String", "String");
        assertThat(result, is(true));
    }

    @Test
    public void whenStringSmallBigerThanBig(){
        WordInWord wordInWord = new WordInWord();
        boolean result = wordInWord.contains("St", "String");
        assertThat(result, is(false));
    }

    @Test
    public void whenStringContainsThanStriring(){
        WordInWord wordInWord = new WordInWord();
        boolean result = wordInWord.contains("Striring", "ing");
        assertThat(result, is(true));
    }


}
