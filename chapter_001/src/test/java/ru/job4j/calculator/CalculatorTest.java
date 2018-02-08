package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Andrey Bannikov (andrewnnov@yandex.ru)
* @version $Id$
* @since 0.1
*/

public class CalculatorTest {

/**
* Тест суммы
*/ 
@Test


  public void whenAddOnePlusOneThenTwo() {

    Calculator calc = new Calculator();
    calc.add(1D, 1D);
    double result = calc.getResult();
    double expected = 2D;
    assertThat(result, is(expected));   

    }

/**
* Тест разности
*/ 
  @Test
  public void whenSubtractOneMinusOneThenZero() {

    Calculator calc = new Calculator();
    calc.sub(1D, 1D);
    double result = calc.getResult();
    double expected = 0;
    assertThat(result, is(expected));   

    }

/**
* Тест деления
*/ 

   @Test
  public void whenDivOneDivOneThenOne() {

    Calculator calc = new Calculator();
    calc.div(1D, 1D);
    double result = calc.getResult();
    double expected = 1D;
    assertThat(result, is(expected));   

    }


/**
* Тест умножения
*/ 
   @Test
  public void whenMultiplOneMultOneThenOne() {

    Calculator calc = new Calculator();
    calc.mult(1D, 1D);
    double result = calc.getResult();
    double expected = 1;
    assertThat(result, is(expected));   

    }









}