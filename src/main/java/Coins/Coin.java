package Coins;

public abstract class Coin implements ICalculate {//The value of each coin is measured by its value against the other.
    protected abstract double getValue();

    public abstract double calculate(double amount);//Treats amount as amount from the second coin, and returns amount of the first coin equivalent to the second.

}
