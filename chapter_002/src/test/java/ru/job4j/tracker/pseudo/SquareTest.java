package ru.job4j.tracker.pseudo;

import org.junit.Test;
import ru.job4j.pseudo.Square;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {

    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(square.draw(),
                is(new StringBuilder()
                         .append("++++")
                         .append("++++")
                         .append("++++")
                         .append("++++").toString()));
    }
}

