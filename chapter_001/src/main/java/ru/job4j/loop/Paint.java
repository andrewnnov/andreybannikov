package ru.job4j.loop;

/**
 * @author andreybannikov(andrewnnov@yandex.ru)
 * @version 1.0
 * @since 0.1
 */
public class Paint {
    /**
     * draw a righ-sided pyramid
     * @param height
     * @return screen
     */
    public String rightTrl(int height){
        //buffer for result
        StringBuilder screen = new StringBuilder();
        //weight will be eq height
        int weight = height;
        for(int row = 0; row != height; row++){
            for(int column =0; column != weight; column++){
                if(row >=column){
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * draw a left-sided pyramid
     * @param height
     * @return screen
     */
    public String leftTrl(int height){
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++){
            for (int column = 0; column != weight; column++){
                if(row >= weight - column -1){
                    screen.append("^");
                }else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    /**
     * draw a pyramid
     * @param height
     * @return screen
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
