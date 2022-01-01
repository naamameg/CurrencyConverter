import java.util.Scanner;

public class WelcomeScreen {
    static String chooseNumber = "Please choose an option (1/2):\n 1. Dollars to Shekels\n 2. Shekels to Dollars";
    static String chooseAmount = "Please choose amount to convert";
    static String whatNext = "Would you like to continue? (y/n)";

    protected static void Welcome() {
        System.out.println("Welcome to currency converter");
    }

    protected static String chooseAnOption(String toPrint) {
        Scanner option = new Scanner(System.in);
        System.out.println(toPrint);
        return option.nextLine();


    }

    protected static int chooseCoin() {
        int number = 0;
        String response = chooseAnOption(chooseNumber);
        while (!CheckValidInput.checkCoinOption(response)) {
            System.out.println("please answer 1 or 2");
            response = chooseAnOption(chooseNumber);

        }
        number = Integer.parseInt(response);
        return number;


    }

        protected static double chooseAmount () {
            String response = chooseAnOption(chooseAmount);
            while (!CheckValidInput.checkAmount(response)){
                System.out.println("please enter a number above zero");
                response = chooseAnOption(chooseAmount);
            }

            double number = Double.parseDouble(response);
            return number;
        }

        protected static String chooseAgain () {
            String response = chooseAnOption(whatNext);
            while (!CheckValidInput.checkChooseAgain(response)){
                System.out.println("please answer y/n");
                response = chooseAnOption(whatNext);
            }

            return response.toLowerCase();

        }

    }