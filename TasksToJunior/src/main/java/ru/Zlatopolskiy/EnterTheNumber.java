package ru.Zlatopolskiy;

public class EnterTheNumber implements Input {

    private String[] numberFromKeyBoard;
    private int position = 0;

    public EnterTheNumber(String[] numberFromKeyBoard) {
        this.numberFromKeyBoard = numberFromKeyBoard;
    }

    @Override
    public String ask(String question) {
        return numberFromKeyBoard[position++];
    }
}
