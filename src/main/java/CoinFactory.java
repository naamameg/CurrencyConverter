public class CoinFactory {

    public static Coin getCoin() {
        if (coinType == null) {
            return null;
        }
        if (coinType.equalsIgnoreCase("ils")) {
            return new ILS();
        } else if (coinType.equalsIgnoreCase("usd")) {
            return new USD();
        }


        return null;

    }
}
