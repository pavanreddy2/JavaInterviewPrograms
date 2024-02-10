package com.java8Techie;

import com.lambda.realExample.Customer;
import com.lambda.realExample.EkartDataBase;

import java.util.List;

public class OptionalDemo {

    public static Customer getCustomerByEmailId (String email) throws Exception {
      List<Customer> customers = EkartDataBase.getll();
      return  customers.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny().orElseThrow(() -> new Exception("No Customer present with the given Email Id"));


    }

    public static void main(String[] args) throws Exception {

       // getCustomerByEmailId("john@gmail.com");

        //System.out.println(getCustomerByEmailId("john@gmail.com"));
        System.out.println(getCustomerByEmailId("pqr"));

    }
}
