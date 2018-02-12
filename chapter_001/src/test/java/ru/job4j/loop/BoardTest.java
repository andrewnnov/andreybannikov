package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author andreybannikov andrewnnov@yandex.ru
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {
    @Test
    public void when3x3(){
        Board board = new Board();
        String rls = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rls, is(String.format("X X%s X %sX X%s", ln, ln, ln)));
    }
    @Test
    public void when5x4(){
        Board board = new Board();
        String rls = board.paint(5, 4);
        String ln = System.lineSeparator();
        assertThat(rls, is(String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln, ln)));
    }
}
