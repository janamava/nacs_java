package javaWeek_3.exercise1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScreenTest {

    private Screen screen = new Screen();

    @Test
    void testBusinessCustomer(){
        Customer customer = new Customer("Alma", "business");
        String displayed = screen.display(customer);
        Assertions.assertEquals("ALMA", displayed);
    }

    @Test
    void testEconomyCustomer(){
        Customer customer = new Customer("Derek", "economy");
        String displayed = screen.display(customer);
        Assertions.assertEquals("derek", displayed);

    }

    @Test
    void testOtherCustomer(){
        Customer customer = new Customer("leo", "whale");
        String displayed = screen.display(customer);
        Assertions.assertEquals("There is an error", displayed);

    }

    @Test
    void isNameEmpty() {
        Customer customer = new Customer("", "business");
        String displayed = screen.display(customer);
        Assertions.assertEquals("There is an error", displayed);
    }

    @Test
    void isCategoryEmpty() {
        Customer customer = new Customer("Friedrich", "");
        String displayed = screen.display(customer);
        Assertions.assertEquals("There is an error", displayed);
    }


}

/*
Create the ScreenTest class and test its behavior.
Write three methods: testBusinessCustomer,
testEconomicCustomer
and testOtherCustomer.
What happens when a business class has to be displayed?
What happens when the customer is in economic class?
What if they have a different category or none at all?
 */