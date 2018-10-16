package ru.Zlatopolskiy.task15_21october;
/*
Your program should take integer value (n) from keyboard, and print n-th fibonacci number.
THere should be two solutions: calculating fibonacci number using iterative solution (using loop),
 and recursive solution (without loop).
  Inside of your methods you have to use BigInteger class for storing numbers
 (since fibonacci values can be huge) Both solution should be covered with unit-tests.

 */

import java.math.BigInteger;
import java.util.Scanner;

public class TaskG01_02_fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fibMyRecursive(scanner.nextInt()));
        System.out.println(fibMyIterative(scanner.nextInt()));
    }


    /**
     * Method is difine sequence Fib using recursion
     * @param number integer
     * @return BigInteger type
     */
    public static BigInteger fibMyRecursive(int number) {

        return number < 2 ? BigInteger.valueOf(1) : fibMyRecursive(number - 2).add(fibMyRecursive(number -1));
     }


    /**
     * Method is difine sequence Fib using iterative
     * @param number is integer type
     * @return BigInteger type
     */
    public static BigInteger fibMyIterative(int number) {

        if(number == 0 || number == 1) {
            return BigInteger.valueOf(1);
        }

        int[] result = new int[number + 1];
        result[0] = 1;
        result[1] = 1;

        for (int k = 2; k < result.length ; k++) {
            result[k] = result[k-2] + result[k-1];
        }

        return BigInteger.valueOf(result[number]);


    }



}
