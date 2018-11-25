package javaWeek_3.exercise4;

public class HackerApplication {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        String message = "Aizhan is lazy today8";
        message = messenger.send(message);
        messenger.receive(message);
    }
}
/*
In the HackerApplication class main method,
create one String message
and a Messenger
and send
and receive it to see the results.
 */