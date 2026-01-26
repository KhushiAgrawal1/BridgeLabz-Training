package com.regex;

import java.util.regex.*;

public class UsernameValidator {
    public static void main(String[] args) {

        String[] usernames = {
            "user_123",
            "123user",
            "us",
            "Valid_User1",
            "A_1b2"
        };

        String regex = "^[A-Za-z][A-Za-z0-9]{4,14}$";

        for (String username : usernames) {

            if (username.matches(regex)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}

