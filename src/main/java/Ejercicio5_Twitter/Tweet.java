package Ejercicio5_Twitter;

import java.time.LocalDate;

public class Tweet {
    private LocalDate time;
    private String message;
    private UserAccount sender;

    public Tweet(LocalDate time, String message, UserAccount sender) {
        if (message.length() > 140) {
            throw new IllegalArgumentException("El mensaje no puede contener más de 140 caracteres");
        }
        this.time = time;
        this.message = message;
        this.sender = sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "time=" + time +
                ", message='" + message + '\'' +
                ", sender=" + sender +
                '}';
    }
    public String getText() {
        return message;
    }
}