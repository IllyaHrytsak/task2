package ua.training;


import java.util.Scanner;

public class Controller {

    public static final int MIN_RANGE = 0;
    public static final int MAX_RANGE = 10;

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        int randNumber = model.rand(MIN_RANGE, MAX_RANGE);

        findRandNumber(randNumber, scanner);

        view.finalResult(model.getStatistic());
    }

    private int inputIntValue(Scanner sc) {
        System.out.print(View.INPUT_NUMBER);
        while (!sc.hasNextInt()) {
            System.out.println(View.WRONG_INPUT_DATA);
            System.out.print(View.INPUT_NUMBER);
            sc.next();
        }
        return sc.nextInt();
    }

    private void findRandNumber(int randNumber, Scanner sc) {
        boolean value = true;
        while (value) {
            int userNumber = inputIntValue(sc);
            model.addNumber(userNumber);
            value = model.checkNotEqual(randNumber, userNumber);
            if (value) {
                view.showRange(MIN_RANGE, MAX_RANGE);
                view.showStatistic(model.getStatistic());
                System.out.println(View.WRONG_NUMBER + userNumber);
                System.out.println();
            }
        }
    }

}
