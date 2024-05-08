package Ejercicio5_Twitter;

import java.time.LocalDate;

public class DirectMessage extends Tweet {
    private UserAccount receiver;

    public DirectMessage(LocalDate date, String message, UserAccount sender, UserAccount receiver) {
        super(date, message, sender);
        this.receiver = receiver;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "DirectMessage{" +
                "receiver=" + receiver +
                "} " + super.toString();
    }
}