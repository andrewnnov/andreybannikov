package ru.dinamicstructure.exeption;

public class _App14_part2_lecture2 {
    public static void main(String[] args) {
        try {
            throw new OutOfMemoryError();

        } catch (Error e) {
            throw new NullPointerException();
            //вторым catch нельзя поймать исключение из первого catch
        }catch (Exception e) {
            throw new NullPointerException();
        } finally {
            System.err.println(0);
        }
        //не дойдем до этого места
       // System.err.println(1);
    }
}
