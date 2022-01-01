import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class Main {

    static ILS ils = (ILS) CoinFactory.getCoin();
    static USD usd = (USD) CoinFactory.getCoin();

    public static double converter(int choice, double input) {

        double convertedCoin = 0;
        if (choice == 1) {
            convertedCoin = ils.calculate(input);
        } else if (choice == 2) {
            convertedCoin = usd.calculate(input);
        }
        return convertedCoin;
    }


    public static void main(String[] args) throws IOException {

        List <Double> resultsList = new ArrayList<>();

        WelcomeScreen.Welcome();

        do {
            double result = converter(WelcomeScreen.chooseCoin(), WelcomeScreen.chooseAmount());
            System.out.println(result);
            resultsList.add(result);

        } while (WelcomeScreen.chooseAgain().equals("y"));
        FileWriter resultsFile = new FileWriter("results.txt");
        resultsFile.write(String.valueOf(resultsList));
        resultsFile.close();

        System.out.println("Thanks for using our currency converter!");
        System.out.println("This is a list of all your converted amounts:\n" +
                resultsList);
    }





    }


