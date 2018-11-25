package javaWeek_3.exercise1;

public class Screen {

    public String display(Customer customer) {      //Customer is a type, customer is a certain customer)

        String name = customer.getName();
        if (name.isEmpty()){
            System.out.println("There is an error");
            return "There is an error";
        }

        if (customer.getCategory().equals("business")) {
            name = name.toUpperCase();
            System.out.println(name);
        }
        else if (customer.getCategory().equals("economy")){
            name = name.toLowerCase();
            System.out.println(name);
        }

        else {
            System.out.println("There is an error");
            return "There is an error";
        }

        return name;
    }

}
/*
Create a condition if category = something unextected
Create a condition if category = ""

A Screen can display a customer name according to the railway rules,
and it also returns the name it displayed so that it can be tested afterwards.
 */
