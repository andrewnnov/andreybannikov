package ru.Zlatopolskiy;

import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Составить программу вывода на экран числа, вводимого с клавиатуры. Выводимому числу должно предшествовать сообщение "Вы ввели число".
 */

public class Task01_003_TestNew {

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                Task01_003.main();
            }
        };
        testOutput(task, "1234", "Вы ввели число: 123\r\n");


    }

    private static void testOutput(Runnable runnable, String input, String expectedOutput) {

        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();

        System.setOut(new PrintStream(testOut));
        System.setIn(testIn);

        runnable.run();


        String actualOutput = testOut.toString();

        Assert.assertEquals(expectedOutput, actualOutput);


    }

}
