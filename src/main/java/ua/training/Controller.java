package ua.training;


import java.util.Scanner;

public class Controller {


    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        model.setMinAndMaxRange(GlobalValues.PRIMARY_MIN_BARRIER,
                                GlobalValues.PRIMARY_MAX_BARRIER);

        model.rand();


        findRandNumber(model.getSecretNumber(), scanner);

        view.finalResult(model);
    }


    private void findRandNumber(int randNumber, Scanner sc) {
        boolean value = true;
        while (value) {
            int userNumber = inputIntValue(sc);
            model.addNumber(userNumber);
            value = model.checkNotEqual(randNumber, userNumber);
            if (value) {
                view.showRange(model);
                view.showStatistic(model);
                view.showWrongInputNumber(userNumber);
            }
        }
    }

    private int inputIntValue(Scanner sc) {
        view.inputData();
        while (!sc.hasNextInt()) {
            view.showWrongInputData();
            sc.next();
        }
        return sc.nextInt();
    }



}
