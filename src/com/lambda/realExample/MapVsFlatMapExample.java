package com.lambda.realExample;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapExample {
    public static void main(String[] args) {

        List<Customer> customers = EkartDataBase.getll();
        //from these  customers I want to get list of Strings. which is email Id'
        //List<Customers> convert List<string> -> Data Transformation
        //Map function we have to use one to one mapping
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        //Here from list of customers we are mapping only email to a List of Strings.
        System.out.println(emails);

        //Similar way I want to fetch List of phone numbers.
        //here one customer as Many Phone Numbers ==> One to Many mapping
        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);
        //here return Type is List of list String.
        //I dont want List of list , I want to get list of strings.

        List<String> phoneNumberList = customers.stream()
                          .flatMap(customer -> customer.getPhoneNumbers().stream())
                                        .collect(Collectors.toList());
        System.out.println(phoneNumberList);
    }
}
