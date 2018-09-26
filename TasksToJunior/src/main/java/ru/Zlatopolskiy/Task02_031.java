package ru.Zlatopolskiy;

import java.util.Scanner;

/*
В трехзначном числе x зачеркнули его вторую цифру. Когда к образованному
при этом двузначному числу справа приписали вторую цифру числа x, то по-
лучилось число n. По заданному n найти число x (значение n вводится с кла-
виатуры, 100 ≤ n ≤ 999).
 */

public class Task02_031 {

    /**
     * enter from keyboard
     */
    public void enterTheNumber () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 100 до 999");
        int number = scanner.nextInt();
        changeNumber(number);
    }

    /**
     *
     * @param inputNumber - number from 100 to 999 (if input 123 exit 132)
     * @return int
     */

    public int changeNumber(int inputNumber) {

        String inputNumberString = String.valueOf(inputNumber);
        char [] inputNumberChar = inputNumberString.toCharArray();

        char tmp = inputNumberChar[1];
        inputNumberChar[1] = inputNumberChar[2];
        inputNumberChar[2] = tmp;

        int result = Character.digit(inputNumberChar[0], 10)*100 + Character.digit(inputNumberChar[1],10)*10 + Character.digit(inputNumberChar[2],10)*1;
        return result;
    }
}
