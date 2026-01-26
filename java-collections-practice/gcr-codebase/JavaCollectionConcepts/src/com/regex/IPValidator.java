package com.regex;

import java.util.regex.*;

public class IPValidator {
    public static void main(String[] args) {

        String[] testIPs = {
            "192.168.1.1",
            "255.255.255.255",
            "0.0.0.0",
            "256.1.1.1",
            "192.168.1",
            "192.168.01.1"
        };

        // Regex for IPv4 validation
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
                     + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        Pattern pattern = Pattern.compile(regex);

        for (String ip : testIPs) {
            System.out.println(ip + " → " + pattern.matcher(ip).matches());
        }
    }
}

