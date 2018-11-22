package evaluations.week2;

public class PostOfficeApplication {

    public static void main(String[] args) {
        Letter myLetter = new Letter("North pole");
        PostOfficeAssistant derek = new PostOfficeAssistant();
        derek.stamp(myLetter);
        derek.send(myLetter);

        System.out.println(myLetter.getAddress()); //access the attribute by .

    }
}

/*
In the PostOfficeApplication class main method,
 create a Letter and a PostOfficeAssistant, and use it to stamp the letter and then send it.
 */