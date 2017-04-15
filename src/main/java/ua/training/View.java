package ua.training;

import java.util.List;

public class View {

    public static final String INPUT_NUMBER = "Input number: ";
    public static final String WRONG_NUMBER = "Wrong number: ";
    public static final String WRONG_INPUT_DATA = "Wrong input data";
    public static final String NUMBER_OF_ATTEMPTS = "Attempts: ";
    public static final String YOU_WINNER = "You guessed the number! ";
    public static final String Range_IS = "Range: ";
    public static final String TO = " - ";
    public static final String SPACE = " ";
    public static final String ENTERED_NUMBERS = "Entered numbers: ";

    public void showStatistic(Model model) {
        List<Integer> arrayList = model.getStatistic();
        System.out.println(NUMBER_OF_ATTEMPTS + arrayList.size());
        System.out.print(ENTERED_NUMBERS);
        for (int digit : arrayList) {
            System.out.print(digit+SPACE);
        }
        System.out.println();
    }

    public void showRange(Model model) {
        System.out.println(Range_IS + model.getMinRange() + TO + model.getMaxRange());
    }

    public void showWrongInputData() {
        System.out.println(WRONG_INPUT_DATA + INPUT_NUMBER);
    }

    public void showWrongInputNumber(int number) {
        System.out.println(WRONG_NUMBER + number);
    }

    public void inputData() {
        System.out.print(INPUT_NUMBER);
    }

    public void finalResult(Model model) {
        System.out.println(YOU_WINNER);
        showStatistic(model);
    }
}
