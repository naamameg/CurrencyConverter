package UserInput;

public class CheckValidInput {

    protected static boolean checkCoinOption(String answer){//Checks is the answer fits the term of the question.
        int number = 0;
        try {
            number = Integer.parseInt(answer);
        } catch (NumberFormatException e) {
            return false;
        }
        if(number > 3){
            return false;
        }

        if (number < 1){
            return false;
        }

        return true;

    }

    protected static boolean checkChooseAgain(String answer) {//Checks is the answer fits the term of the question.
        return answer.equals("y") || answer.equals("n");
    }

    protected static boolean checkAmount(String answer){//Checks is the answer fits the term of the question.
        double number = 0;

        try {
            number = Double.parseDouble(answer);

        } catch (NumberFormatException e) {
            return false;
        }

        if (number <= 0){
            return false;
        }
        return true;
    }
}
