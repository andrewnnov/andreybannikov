package ru.Zlatopolskiy.task1_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task05_27Test {

    //а
    @Test
    public void whenRange1_5ThenSum15() {
        Task05_027 task = new Task05_027();
        assertEquals(15,task.sumRangeOfNumbers());
    }

    //б
    @Test
    public void whenRange499_500ThenSum999() {
        Task05_027 task = new Task05_027();
        assertEquals(999,task.sumRangeOfNumbersAto500(499));
    }

    //в
    @Test
    public void whenRangeMinus10_BThenSumMinus19() {
        Task05_027 task = new Task05_027();
        assertEquals(-19,task.sumRangeOfMinus10toB(-9));
        System.out.println(task.sumRangeOfMinus10toB(-9));
    }

    @Test
    public void whenBOutRngeThenMinus1111() {
        Task05_027 task = new Task05_027();
        assertEquals(-1111,task.sumRangeOfMinus10toB(-11));
        System.out.println(task.sumRangeOfMinus10toB(-11));
    }
    //г
    @Test
    public void whenRangeFromA1ToB2ThenSum3() {
        Task05_027 task = new Task05_027();
        assertEquals(3,task.sumRangeOfMinus10toB(1, 2));
        System.out.println(task.sumRangeOfMinus10toB(1, 2));
    }







}
