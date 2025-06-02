package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpractice {

    public static void main(String[] args) {
        String text = "your username is bob and password is pass@word";

        System.out.println("Phone: " + getPhoneNumber(text));
        System.out.println("Email: " + getEmail(text));
        System.out.println(getUserNameAndPassword(text));
    }

    public static String getPhoneNumber(String text) {
        Matcher matcher = Pattern.compile("\\+91\\d{10}").matcher(text);
        return matcher.find() ? matcher.group() : null;
    }

    public static String getEmail(String text) {
        Matcher matcher = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}").matcher(text);
        return matcher.find() ? matcher.group() : null;
    }

    public static String getUserNameAndPassword(String text) {
        String regex = "(?i)user(?:name)?\\s*(?:is|=|:)\\s*(\\S+).*?(?:and|&|\\|\\||,)?\\s*.*?pass(?:word)?\\s*(?:is|=|:)\\s*(\\S+)";
        Matcher matcher = Pattern.compile(regex).matcher(text);
        return matcher.find() ? "Username: " + matcher.group(1) + ", Password: " + matcher.group(2) : "No username/password found.";
    }
    
    public static String extractPhoneAndEmail(String text) {
        Matcher phone = Pattern.compile("\\+91\\d{10}").matcher(text);
        Matcher email = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}").matcher(text);
        return "Phone: " + (phone.find() ? phone.group() : "Not found") +
               ", Email: " + (email.find() ? email.group() : "Not found");
    }

}
