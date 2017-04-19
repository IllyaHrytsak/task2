package ua.training;


public enum Number {

    ZERO (0),
    TWENTY (20),
    FORTY (40),
    SIXTY (60),
    EIGHTY (80),
    HUNDRED (100),
    LAST_NUMBER ();

    Number(int number) {
        this.number = number;
    }

    Number() { }

    private int number;

    public void setLastNumber(int number) {
        LAST_NUMBER.number = number;
    }

    public int getNumber() {
        return this.number;
    }

}
