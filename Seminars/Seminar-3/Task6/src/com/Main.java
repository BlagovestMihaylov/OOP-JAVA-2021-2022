package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        printListOfAllFridays13();
    }

    private static  void printListOfAllFridays13()
    {
       // Locale bgLocale = new Locale("bg", "BG");
        Locale.setDefault(Locale.US);
        //[1900; 2020]
        Random random = new Random();
        int year = 1900 + random.nextInt(121); //2020-1900+1=121
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("EEEE, dd MM yyyy");
        for(int i = 1; i<=12; i++)
        {
            LocalDate date = LocalDate.of(year, i, 13);
            if(date.getDayOfWeek() == DayOfWeek.FRIDAY)
            {
                System.out.println(dateTimeFormatter.format(date));
            }
        }
    }
}
