package ru.job4j.tracker.pseudo;

import org.junit.Test;
import ru.job4j.pseudo.Square;
import ru.job4j.pseudo.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(),
                is(new StringBuilder()
                        .append("+   ")
                        .append("++  ")
                        .append("+++ ")
                        .append("++++").toString()));
    }
}
