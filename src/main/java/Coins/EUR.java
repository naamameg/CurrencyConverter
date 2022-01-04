package Coins;

public class EUR extends Coin{

    final static double value = 4.23;
    @Override
    protected double getValue() {//Return the value of the coin EUR.
        return value;
    }

    @Override
    public double calculate(double amount) {//Return the value of the EUR in ILS.
        return value * amount;
    }
}
