public class ILS extends Coin {
    final static double value = 0.32;

    @Override
    protected double getValue() {
        return value;
    }

    @Override
    public double calculate(double amount) {

        return value * amount;
    }
}
