package ru.Zlatopolskiy;

import java.util.Scanner;

/*
Составить программу вывода на экран числа, вводимого с клавиатуры. Выво-димому числу должно предшествовать сообщение "Вы ввели число".
 */

public class Task01_003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
    }

//    public static void printNumber(String number) {
//        System.out.println("Введенное число: " + number);
//    }


/*
    public void showToConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int enteredNumber = scanner.nextInt();
        System.out.print("Введенное число: " + enteredNumber);
    }
    */


//    public static void main(String[] args) {
//        Task01_003 task = new Task01_003();
//        String answer = task.ask("Введите число: ");
//        System.out.println("Введеное число: " + answer);
//    }

//    public void printNumber() {
//       // System.out.println("Вы ввели число: 100");
//        System.out.print("Вы ввели число: " + enterNumberFromKeyBoard());
//    }
//
//    public int enterNumberFromKeyBoard() {
//        Scanner scanner = new Scanner(System.in);
//        int result = scanner.nextInt();
//        scanner.close();
//        return result;
//
//    }

//    @Override
//    public String ask(String question) {
//        System.out.println(question);
//        return scanner.nextLine();
//    }
}
