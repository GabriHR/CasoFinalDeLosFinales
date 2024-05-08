package Ejercicio5_Twitter;

public class UtilsValidacion {
    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    public static boolean isValidAlias(String alias) {
        return alias.matches("[a-zA-Z0-9]+");
    }
}