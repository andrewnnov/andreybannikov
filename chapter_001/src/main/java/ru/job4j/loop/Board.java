package ru.job4j.loop;

/**
 * @author andreybannikov
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     *
     * @param width
     * @param height
     * @return screen
     */
    public String paint(int width, int height){
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if((i + j)% 2 ==0){
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            //перевод на новую строку
            screen.append(ln);
        }
        return screen.toString();
    }
}
