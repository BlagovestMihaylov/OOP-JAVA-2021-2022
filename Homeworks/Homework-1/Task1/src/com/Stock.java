package com;

public class Stock
{
    private  String symbol; //Intellij suggests the variable to be "final"
    private  String name;   //Intellij suggests the variable to be "final"
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name)
    {
        this.symbol = symbol; //this.symbol is the field variable, symbol is the function parameter
        this.name = name;     //this.name is the field variable, name is the function parameter
    }

    public String getSymbol()
    {
        return symbol; //returning the field
    }

    public String getName()
    {
        return name;  //returning the field
    }

    public double getCurrentPrice()
    {
        return currentPrice;  //returning the field
    }

    public double getPreviousClosingPrice()
    {
        return previousClosingPrice;  //returning the field
    }

    public void setPreviousClosingPrice(double price) throws Exception
    {
        if (price >= 0) this.previousClosingPrice = price;  //there cannot be negative price
        else throw new Exception("Negative number");        //throws an Exception
    }

    public void setCurrentPrice(double price) throws Exception
    {
        if (price >= 0) this.currentPrice = price;          // again cannot be negative price
        else throw new Exception("Negative number");        //another Exception
    }

    public double changePercent()
    {
        double difference = this.currentPrice - this.previousClosingPrice;   //getting the difference between current and previous stock price
        return difference / this.previousClosingPrice * 100;                 //getting the percentage
                                                                             //if it is positive number its increase, if it is negative number its decrease
    }
}
