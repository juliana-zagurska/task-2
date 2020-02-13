package out;

import java.util.Random;

public class Model {


    public int generateRandomValueInRange (int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public boolean isInputDigit(String input) {
            return input.chars().allMatch(Character::isDigit);
        }
}
