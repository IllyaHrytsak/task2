package ua.training;



public class Controller {


    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {

        model.setMinAndMaxRange(GlobalValues.PRIMARY_MIN_BARRIER,
                                GlobalValues.PRIMARY_MAX_BARRIER);

        model.rand();

        int secretNumber = model.getSecretNumber();

        enumTest(secretNumber);

        view.finalResult(model);
    }


    private boolean findRandNumber(int randNumber, int userNumber) {
            model.addNumber(userNumber);
            boolean value = model.checkNotEqual(randNumber, userNumber);
            if (value) {
                view.showRange(model);
                view.showStatistic(model);
                view.showWrongInputNumber(userNumber);
                return false;
            }
        return true;
    }

    private void enumTest(int secretNumber) {
        Number.LAST_NUMBER.setLastNumber(secretNumber);
        for (Number number : Number.values()) {
            boolean check = findRandNumber(secretNumber, number.getNumber());
            if (check) return;
        }
    }

}
