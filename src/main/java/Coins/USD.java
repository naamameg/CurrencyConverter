package Coins;

public class USD extends Coin {
    final static double value = 3.11;

    @Override
    protected double getValue() {//Return the value of the coin USD.
        return value;
    }

    @Override
    public double calculate(double amount) {//Return the value of the USD in ILS.

        return value * amount;
    }
}