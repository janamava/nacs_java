package javaWeek3.exercise2;

import javaWeek3.exercise1.Customer;

import java.util.ArrayList;
import java.util.List;

public class InsuranceApplication {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        Customer customerOne = new Customer("Mr. Smith", "economy");
        Customer customerTwo = new Customer("Mrs. Smith", "business");
        Customer customerThree = new Customer("Ms. Poppins", "business");
        Customer customerFour = new Customer("Mugatu Hokopoko", "economy");
        Customer customerFive = new Customer("Bob Smith","business");

        customers.add(customerOne);
        customers.add(customerTwo);
        customers.add(customerThree);
        customers.add(customerFour);
        customers.add(customerFive);

        TemplateChooser templateChooser = new TemplateChooser();

        for (Customer customer : customers) {
            templateChooser.chooseTemplate(customer);

            }

        }
    }
/*
In the InsuranceApplication class main method,
 create several Customers
 and a TemplateChooser and see the results.
 */