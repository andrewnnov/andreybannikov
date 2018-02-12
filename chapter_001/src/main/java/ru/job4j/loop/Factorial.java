package ru.job4j.loop;

public class Factorial {
    /**
     * Calculate factorial
     * @param n natural number and null
     * @return factorial n
     */
    public int calc(int n){
        int count = 1;
        if(n == 0){
            return 1;
        } else {
            for(int i = 1; i <= n; i++){
                count = count*i;
            }
            return count;
        }
    }
}
