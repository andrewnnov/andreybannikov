package ru.job4j;

public class Fit {

    /**
     * best weight for men
     * @param height
     * @return best weight
     */

    public double manWeight(double height) {
        return (height - 100)*1.15;
    }


    /**
     * best weight for women
     * @param height
     * @return best weight
     */

    public double womanWeight(double height) {
        return (height - 110)*1.15;
    }


}
