package com;

import java.util.Scanner;

public class StockTest
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Stock Symbol: ");
        String symbol = input.next();
        System.out.print("Enter Stock Name: ");
        String name = input.next();
        Stock stock = new Stock(symbol, name);  //making new Stock object
        System.out.print("Enter current price: ");
        stock.setCurrentPrice(input.nextDouble());
        System.out.print("Enter previous closing price: ");
        stock.setPreviousClosingPrice(input.nextDouble());

        System.out.print("Stock symbol: " + stock.getSymbol() + "\n" +
                         "Stock name: " + stock.getName() + "\n" +
                         "Stock current price: " + stock.getCurrentPrice() + "\n" +
                         "Stock previous closing price: " + stock.getPreviousClosingPrice() + "\n" +
                         "Price differance in percents: " + stock.changePercent()
                                                                                    );


    }
}
