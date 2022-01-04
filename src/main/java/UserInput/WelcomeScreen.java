package UserInput;

import Coins.*;

import java.util.Scanner;

public class WelcomeScreen {
    private static String chooseNumber = "Please choose an option (1/2/3):\n 1. Dollars to Shekels\n 2. Shekels to Dollars\n 3. Shekel to Euros";
    private static String chooseAmount = "Please choose amount to convert";
    private static String whatNext = "Would you like to continue? (y/n)";

    public static void Welcome() { //Prints a welcome massage
        System.out.println("Welcome to currency converter\n" +
                "=============================\n");
    }

    private static String chooseAnOption(String toPrint) {//Scans a single line of user input.
        Scanner option = new Scanner(System.in);
        System.out.println(toPrint);
        return option.nextLine();


    }

    public static Coins chooseCoin() { //Prompts the user for number, validates it and keep ask him if the number do not fit the question. Then return enum that fits the number.
        int number = 0;
        String response = chooseAnOption(chooseNumber);
        while (!CheckValidInput.checkCoinOption(response)) {
            System.out.println("please answer 1, 2 or 3");
            response = chooseAnOption(chooseNumber);

        }
        number = Integer.parseInt(response);
        ;
        return numberToEnum(number);


    }
    private static Coins numberToEnum(int number) throws IllegalArgumentException {//Converts number to coin enum.
        switch (number) {
            case 1:
                return Coins.ILS;


            case 2:
                return Coins.USD;

            case 3:
                return Coins.EUR;
        }
        throw new IllegalArgumentException();
    }


        public static double chooseAmount() {//Prompts the user for amount to convert, validates it and keep ask him if the amount do not fit the terms. Then return the amount.
            String response = chooseAnOption(chooseAmount);
            while (!CheckValidInput.checkAmount(response)){
                System.out.println("please enter a number above zero");
                response = chooseAnOption(chooseAmount);
            }

            double number = Double.parseDouble(response);
            return number;
        }

        public static String chooseAgain() {//Prompts the user what to do next, continue or leave, validates it and keep ask him if the answer do not fit the options. Then return the answer.
            String response = chooseAnOption(whatNext);
            while (!CheckValidInput.checkChooseAgain(response)){
                System.out.println("please answer y/n");
                response = chooseAnOption(whatNext);
            }

            return response.toLowerCase();

        }

    }