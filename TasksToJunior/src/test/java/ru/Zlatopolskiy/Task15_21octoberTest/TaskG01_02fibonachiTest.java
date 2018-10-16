package ru.Zlatopolskiy.Task15_21octoberTest;

import org.junit.Test;
import ru.Zlatopolskiy.task15_21october.TaskG01_02_fibonacci;
import ru.Zlatopolskiy.task15_21october.TaskG01_1Factorial;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class TaskG01_02fibonachiTest {

    @Test
    public void when15RecurseThen987() {

        assertEquals(BigInteger.valueOf(987), TaskG01_02_fibonacci.fibMyRecursive(15));
    }

    @Test
    public void when15IterativeThen987() {

        assertEquals(BigInteger.valueOf(987), TaskG01_02_fibonacci.fibMyIterative(15));
    }


}
