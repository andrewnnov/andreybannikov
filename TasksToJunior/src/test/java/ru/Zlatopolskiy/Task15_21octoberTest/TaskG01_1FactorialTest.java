package ru.Zlatopolskiy.Task15_21octoberTest;

import org.junit.Test;
import ru.Zlatopolskiy.task15_21october.TaskG01_1Factorial;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class TaskG01_1FactorialTest {


    @Test
    public void whe5Then120() {
        TaskG01_1Factorial task = new TaskG01_1Factorial();
        assertEquals(120, task.calculationFactorialIterMy(100));
    }

    @Test
    public void whe0Then1() {
        TaskG01_1Factorial task = new TaskG01_1Factorial();
        assertEquals(1, task.calculationFactorialIterMy(0));
    }


    @Test
    public void whe5RecThen120() {
        TaskG01_1Factorial task = new TaskG01_1Factorial();
        assertEquals(120, task.calculationFactorialIterRec(100));
        System.out.println(task.calculationFactorialIterRec(5));
    }

    @Test
    public void whe5RecThen120BigInt() {
        TaskG01_1Factorial task = new TaskG01_1Factorial();
        assertEquals(BigInteger.valueOf(120), task.calculationFactorialIterMyBigInt(100));
        System.out.println(task.calculationFactorialIterRec(5));
    }


    @Test
    public void whe5RecThen120BigIntRec() {
        TaskG01_1Factorial task = new TaskG01_1Factorial();
        assertEquals(BigInteger.valueOf(120), task.calculationFactorialRecMyBigInt(1000000));
        System.out.println(task.calculationFactorialIterRec(5));
    }
}
