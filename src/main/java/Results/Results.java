package Results;
import Coins.Coins;

public class Results {

    Coins originalCoin;
    double firstCoin;
    Coins convertedCoin;
    double secondCoin;

    public Results(Coins originalCoin, double firstCoin, Coins convertedCoin, double secondCoin){
        this.originalCoin = originalCoin;
        this.firstCoin = firstCoin;
        this.convertedCoin = convertedCoin;
        this.secondCoin = secondCoin;
    }

    @Override
    public String toString() {
        return firstCoin + " " + originalCoin + " to " + secondCoin + " " + convertedCoin;




    }
}
