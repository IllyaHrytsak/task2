package ua.training;


import java.util.ArrayList;

public class Model {

    private int minRange;
    private int maxRange;

    private int secretNumber;

    private ArrayList<Integer> arrayList = new ArrayList<>();


    public int getSecretNumber() { return secretNumber; }

    public int getMinRange() { return minRange; }

    public int getMaxRange() { return maxRange; }

    public void setMinAndMaxRange(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public void rand() {
        secretNumber =  (int) (Math.random() * (maxRange - minRange + 1) + minRange);
    }

    public void addNumber(int number) {
        arrayList.add(number);
    }

    public ArrayList<Integer> getStatistic() { return this.arrayList; }

    public boolean checkNotEqual(int randNumber, int userNumber) {
        return randNumber != userNumber;
    }
}
