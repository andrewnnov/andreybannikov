package ru.dinamicstructure.exeption;

public class _App10_lecture3 {
    public static void main(String[] args) {
        System.err.println(0);
        try {
            throw new RuntimeException();
        } catch (Error e) {
            System.err.println("A");
        } catch (RuntimeException e) {
            System.err.println("B");
        } catch (Exception e) {
            System.err.println("C");
        }
        System.err.println(1);
    }
}
