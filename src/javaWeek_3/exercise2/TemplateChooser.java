package javaWeek_3.exercise2;

import javaWeek_3.exercise1.Customer;

public class TemplateChooser {

    public void chooseTemplate(Customer customer) {

        String name = customer.getName();

        if (name.contains(" ")) {
            name = name.trim();
        }
        if (name.startsWith("Mr.")) {
            System.out.println("Send a man template to " + name);
        }
        else if (name.startsWith("Ms.") || (name.startsWith("Mrs."))) {
            System.out.println("Send a woman template to " + name);
        }
        else if (name.contains("Hokopoko")) {
            System.out.println("Send a privileged template to " + name);
        }
        else {
            System.out.println("Send a default template to " + name);
        }
    }
}

/*
The TemplateChooser has no attributes.
It has the chooseTemplate method that receives a customer
and returns the word man, woman, privileged or default depending on the insurance company’s requirements.
 */