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

    //получаем ссылку на стандартыный вывод в консольсоль
    private final PrintStream stdout = System.out;

    //создаем буфер для хранения вывода
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public  void loadOutput() {
        //замена стандартного вывода на вывод в память для тестирования
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {

        //возвращаем обратно стандартный вывод в консоль
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

    }
}
