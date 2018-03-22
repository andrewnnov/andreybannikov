package ru.job4j.tracker.pseudo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.pseudo.Paint;
import ru.job4j.pseudo.Square;
import ru.job4j.pseudo.Triangle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

    private final PrintStream stdout = System.out;

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public  void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenDrawSquare(){
        new Paint().draw(new Square());
        assertThat(new String(out.toByteArray()),
                is(
                        new StringBuilder()
                        .append("++++")
                        .append("++++")
                        .append("++++")
                        .append("++++")
                        .append(System.lineSeparator())
                        .toString()
                ));
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle(){
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("+   ")
                                .append("++  ")
                                .append("+++ ")
                                .append("++++")
                                .append(System.lineSeparator())
                                .toString()
                ));
        System.setOut(stdout);
    }
}
