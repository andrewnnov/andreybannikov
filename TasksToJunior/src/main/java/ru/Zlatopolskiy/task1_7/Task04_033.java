package ru.Zlatopolskiy.task1_7;

/*
Дано натуральное число.
а) Верно ли, что оно заканчивается четной цифрой?
б) Верно ли, что оно заканчивается нечетной цифрой?
П р и ме ч а н и е
В обеих задачах составное условие не использовать.
 */

public class Task04_033 {

    public String determinationOfLastNumber(int number) {
        if(number%2 == 0) {
            return "Число заканчивается четной цифрой";
        } else return "Число заканчивается нечетной цифрой";
    }
}
