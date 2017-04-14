package ua.training;


import java.util.ArrayList;

public class Model {

    private ArrayList<Integer> arrayList = new ArrayList<>();

    private static final int RAND_MAX = 100;

    public int rand(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public int rand() {
        return (int) (Math.random() * (RAND_MAX + 1));
    }

    public void addNumber(int number) {
        arrayList.add(number);
    }

    public ArrayList<Integer> getStatistic() {
        return this.arrayList;
    }

    public boolean checkNotEqual(int randNumber, int userNumber) {
        return randNumber != userNumber;
    }
}
