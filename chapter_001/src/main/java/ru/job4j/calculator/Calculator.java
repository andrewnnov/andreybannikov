package ru.job4j.calculator;


/**
* App Calculator
* @author Andrey Bannikov (andrewnnov@yandex.ru)
* @version $Id$
* @since 0.1
*/

public class Calculator {

/**
 *the result of operation
*/ 
private double result;
  
/**
 * Method add
 * @param 2 number
 * @return not return.
*/
  public void add(double first, double second) {

  this.result = first + second;

  }

/**
 * Method sub.
 * @param 2 number
 * @return not return.
*/
  public void sub(double first, double second) {

  this.result = first - second;

  }

/**
 * Method div
 * @param 2number
 * @return nut return.
*/
  public void div(double first, double second) {

  this.result = first / second;

  }

/**
 * Method multiplication.
 * @param 2number
 * @return nut return
*/
   public void mult(double first, double second) {

   this.result = first * second;

   }

/**
 * Method getResult.
 * @param 
 * @return return double result.
*/
  public double getResult() {
     
    return this.result;

  }

}