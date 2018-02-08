package ru.job4j.calculator;


/**
* Класс Калькулятор (Calculator)
* @author Andrey Bannikov (andrewnnov@yandex.ru)
* @version $Id$
* @since 0.1
*/


public class Calculator {

/**
 *результат операции
*/ 

private double result;

  
/**
 * Method add(Метод сложения двух значений).
 * @param 2а числа
 * @return метод ничего не возвращает.
*/

  public void add(double first, double second) {

  this.result = first + second;

  }

/**
 * Method sub(Метод вычитания двух значений).
 * @param 2а числа
 * @return метод ничего не возвращает.
*/



  public void sub(double first, double second) {

  this.result = first - second;

  }


/**
 * Method div(Метод деления двух значений).
 * @param 2а числа
 * @return метод ничего не возвращает.
*/


  public void div(double first, double second) {

  this.result = first / second;

  }

/**
 * Method mult(Метод умножения двух значений).
 * @param 2а числа
 * @return метод ничего не возвращает.
*/


   public void mult(double first, double second) {

   this.result = first * second;

   }

/**
 * Method getResult(метод возвращает полученное значение).
 * @param значение операции
 * @return возвращает значение одной из математических операций.
*/


  public double getResult() {
     
    return this.result;


  }




}