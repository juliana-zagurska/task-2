package out;

import java.util.List;

public class View {

    private final static String INCORRECT_INPUT = "Your input is incorrect";
    private final static String HELLO_MESSAGE = "Please, enter a number";

    public void printIncorrectInout(int incorrectInput, int min, int max) {
        System.out.println(INCORRECT_INPUT);
        System.out.println(incorrectInput);
        System.out.println("Range is from " + min + " to " + max);
    }

    public void printStatistics(List<Integer> list) {
        System.out.println("You are win! ");
        list.forEach(System.out::println);
    }

    public void printHelloMessage() {
        System.out.println(HELLO_MESSAGE);
    }
}
