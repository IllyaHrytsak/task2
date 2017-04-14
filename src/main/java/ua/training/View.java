package ua.training;


import java.util.ArrayList;

public class View {

    public static final String INPUT_NUMBER = "Input number: ";
    public static final String WRONG_NUMBER = "Wrong number: ";
    public static final String WRONG_INPUT_DATA = "Wrong input data";
    public static final String ALL_STATISTIC = "Statistic: ";
    public static final String NUMBER_OF_ATTEMPTS = "Number of attempts: ";
    public static final String YOU_WINNER = "You guessed the number!";

    public void showStatistic(ArrayList<Integer> arrayList) {
        System.out.print(ALL_STATISTIC);
        for (int digit : arrayList) {
            System.out.printf("[%d]", digit);
        }
        System.out.println();
        System.out.println(NUMBER_OF_ATTEMPTS + arrayList.size());
    }

    public void showRange(int min, int max) {

        System.out.printf("Range: %d - %d\n", min, max);
    }

    public void finalResult(ArrayList<Integer> arrayList) {
        System.out.println(YOU_WINNER);
        showStatistic(arrayList);
    }
}
