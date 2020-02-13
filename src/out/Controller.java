package out;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public void process(Model model, View view, int min, int max) {
        List<Integer> userTries = new ArrayList<>();
        int randomValue = model.generateRandomValueInRange(min, max);
        Integer userInput = 0;
        Scanner scanner = new Scanner(System.in);

        while (userInput != randomValue) {
            view.printHelloMessage();
            String inp = scanner.nextLine();
            if (model.isInputDigit(inp)) {
                userInput = Integer.valueOf(inp);
            }
            userTries.add(userInput);
            if (userInput != randomValue) {
                view.printIncorrectInout(userInput, min, max);
            }
        }
        view.printStatistics(userTries);

    }

}
