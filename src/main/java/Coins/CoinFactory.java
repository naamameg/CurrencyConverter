package Coins;


public class CoinFactory {//Create objects of the coins, depends on the type the user wants.
    public static Coin getCoin(String coinType) {
        if (coinType == null) {
            return null;
        } if (coinType.equalsIgnoreCase("ils")) {

            return new ILS();
        } else if (coinType.equalsIgnoreCase("usd")) {
            return new USD();
        }
        else if (coinType.equalsIgnoreCase("eur")) {
            return new EUR();}
        return null;
    }
}