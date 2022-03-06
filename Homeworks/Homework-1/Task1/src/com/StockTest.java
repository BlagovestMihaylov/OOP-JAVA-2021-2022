package com;

public class StockTest
{
    public static void main(String[] args) throws Exception
    {
        Stock stock = new Stock("J", "Java");  //making new Stock object
        stock.setCurrentPrice(123);
        stock.setPreviousClosingPrice(45);
        System.out.println(stock.getSymbol());
        System.out.println(stock.getName());
        System.out.println(stock.changePercent());
    }
}
