public class USD extends Coin {
    final static double value = 3.11;

    @Override
    protected double getValue() {
        return value;
    }

    @Override
    public double calculate(double amount) {

        return value * amount;
    }
}