package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {

    public int ask(String question, int[] range){
boolean invalid = true;
int value = -1;
        do {


        try {
            value = super.ask(question, range);
            invalid = false;
        }catch (MenuOutException moe){
            moe.printStackTrace();
            System.out.println("Please select keys from menu");
        }catch (NumberFormatException nfe){
            System.out.println("Please enter validate data again");
        }
        }while (invalid);
        return value;
    }
}
