package com.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculatingExperience {
    public static void main(String[] args) {

        // calculate start date by subtracting 4 years and adding 4 months to the current date
        LocalDate startDate = LocalDate.now().minusYears(3).minusMonths(9);
        // calculate end date by adding 4 months to the start date
        LocalDate endDate =  LocalDate.now();
        // print start and end dates with day of week
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println("Start Date: " + startDate.format(formatter) + " (" + startDate.getDayOfWeek() + ")");
        System.out.println("End Date: " + endDate.format(formatter) + " (" + endDate.getDayOfWeek() + ")");
/*        LocalDate startDate = LocalDate.now().minus(Period.ofYears(5));
        LocalDate presentDate = LocalDate.now();
        DayOfWeek dayOfWeek = startDate.getDayOfWeek();
        System.out.println(startDate + " "+ dayOfWeek);
        System.out.println(presentDate);*/
    }
}
