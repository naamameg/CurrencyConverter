package Coins;

public class ILS extends Coin {
    final static double value = 0.32;

    @Override
    protected double getValue() {//Return the value of the coin ILS.
        return value;
    }

    @Override
    public double calculate(double amount) {//Return the value of the ILS in USD.

        return value * amount;
    }
}
