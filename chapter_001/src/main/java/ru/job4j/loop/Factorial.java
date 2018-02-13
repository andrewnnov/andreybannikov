package ru.job4j.loop;

public class Factorial {
    /**
     * Calculate factorial/
     * @param n natural number and null
     * @return factorial n
     */
    public int calc(int n){
        return (n == 0) ? 1 : n * calc(n - 1);
    }
}
