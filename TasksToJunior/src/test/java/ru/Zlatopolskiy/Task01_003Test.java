package ru.Zlatopolskiy;

import org.junit.*;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.io.*;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;


public class Task01_003Test  {
    /*
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Test
    public void readTextFromStandardInputStream() {
        Task01_003 task = new Task01_003();
        systemInMock.provideLines("Enter the number: ");

        Scanner scanner = new Scanner(System.in);
        assertEquals("Enter the number: ", scanner.nextLine());
    }
    */

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testCase1() {
        final String testString = "Шляпа: ";
        provideInput(testString);

        Task01_003.main(new String[0]);

        assertEquals(testString, getOutput());
    }


//    ///получаем ссылку на стандартыный вывод в консольсоль
//    //private final PrintStream stdout = System.out;
//
//    //получаем буфер для хранения вывода
//    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();
//
//    @Before
//    public void setUpStreams() {
//        System.setOut(new PrintStream(output));
//    }
//
//    @After
//    public void cleanUpStreams() {
//        System.setOut(null);
//    }
//
//    @Test
//    public void whenWeEnter100ThenWePrint100() {
//
//        Task01_003 task = new Task01_003();
//        task.showToConsole();
//        String expected = "Введенное число: ";
//
//        assertEquals(expected, output.toString());
//
//        assertThat();
//
//    }


}





//    ///получаем ссылку на стандартыный вывод в консольсоль
//    private final PrintStream stdout = System.out;
//
//    //создаем буфер для хранения вывода
//    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
//
//    @Before
//    public  void loadOutput() {
//        //замена стандартного вывода на вывод в память для тестирования
//        System.setOut(new PrintStream(this.out));
//    }
//
//    @After
//    public void backOutput() {
//
//        //возвращаем обратно стандартный вывод в консоль
//        System.setOut(this.stdout);
//    }
//

//    @Test
//    public void whenWeEnter100ThenWePrint100() {
//
//               Task01_003 task = new Task01_003();
//               task.printNumber();
//               String expected = "Вы ввели число: 100";
//               assertEquals(expected, out.toString());
//
//    }

//    @Test
//    public void whenWeEnter100ThenWePrint100() {
//
//               Task01_003 task = new Task01_003();
//               task.ask(new EnterTheNumber(new String[]{1}));
//               String expected = "Вы ввели число: 100";
//               assertEquals(expected, out.toString());
//
//    }
//
//    Task01_003 task = new Task01_003();
//
//}
