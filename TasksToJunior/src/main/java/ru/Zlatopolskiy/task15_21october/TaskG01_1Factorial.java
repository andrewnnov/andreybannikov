package ru.Zlatopolskiy.task15_21october;

/*
Your program should take integer value from keyboard, and print factorial for this number.
THere should be two solutions: calculating factorial using iterative solution (using loop),
and recursive solution (without loop). Inside of your methods you have to use
 BigInteger class for storing numbers
(since factorial values can be huge) Both solution should be covered with unit-tests.

 */

import java.math.BigInteger;

public class TaskG01_1Factorial {

    public int calculationFactorialIterMy(int number) {

        int result = 1;

        for (int i = 1; i <=number ; i++) {

            result = result * i;
        }

        return result;

    }



    public int calculationFactorialIterRec(int number) {
        
        return number == 0  ? 1 : number * calculationFactorialIterRec(number -1);

    }
}
