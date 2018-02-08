package ru.job4j.calculator;


/**
* ����� ����������� (Calculator)
* @author Andrey Bannikov (andrewnnov@yandex.ru)
* @version $Id$
* @since 0.1
*/


public class Calculator {

/**
 *��������� ��������
*/ 

private double result;

  
/**
 * Method add(����� �������� ���� ��������).
 * @param 2� �����
 * @return ����� ������ �� ����������.
*/

  public void add(double first, double second) {

  this.result = first + second;

  }

/**
 * Method sub(����� ��������� ���� ��������).
 * @param 2� �����
 * @return ����� ������ �� ����������.
*/



  public void sub(double first, double second) {

  this.result = first - second;

  }


/**
 * Method div(����� ������� ���� ��������).
 * @param 2� �����
 * @return ����� ������ �� ����������.
*/


  public void div(double first, double second) {

  this.result = first / second;

  }

/**
 * Method mult(����� ��������� ���� ��������).
 * @param 2� �����
 * @return ����� ������ �� ����������.
*/


   public void mult(double first, double second) {

   this.result = first * second;

   }

/**
 * Method getResult(����� ���������� ���������� ��������).
 * @param �������� ��������
 * @return ���������� �������� ����� �� �������������� ��������.
*/


  public double getResult() {
     
    return this.result;


  }




}