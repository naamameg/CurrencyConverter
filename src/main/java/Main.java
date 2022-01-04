import Coins.*;
import UserInput.*;
import Results.Results;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class Main {

    static ILS ils = (ILS) CoinFactory.getCoin("ils");
    static USD usd = (USD) CoinFactory.getCoin("usd");
    static EUR eur = (EUR) CoinFactory.getCoin("eur");

    public static Results converter(Coins choice, double input){//Converts the amount the user chose between coin types.
        Results results;
        switch (choice){
            case ILS:
            results = new Results(Coins.USD, input, Coins.ILS, ils.calculate(input));
            return results;
        case USD:
            results = new Results(Coins.ILS, input, Coins.USD, usd.calculate(input));
            return results;
        case EUR:
            results = new Results(Coins.ILS, input, Coins.EUR, eur.calculate(input));
            return results;


    }
        throw (new IllegalArgumentException());
    }

    public static void main(String[] args) throws IOException {

        List <Results> resultsList = new ArrayList<>();

        WelcomeScreen.Welcome();

        do {
            Results result = converter(WelcomeScreen.chooseCoin(), WelcomeScreen.chooseAmount());
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


