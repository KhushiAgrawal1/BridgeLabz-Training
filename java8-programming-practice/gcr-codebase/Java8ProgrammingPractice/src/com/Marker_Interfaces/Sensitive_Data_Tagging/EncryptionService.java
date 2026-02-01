package com.Marker_Interfaces.Sensitive_Data_Tagging;

public class EncryptionService {

    static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting data for: "
                    + obj.getClass().getSimpleName());
            // encryption logic here
        } else {
            System.out.println("No encryption required");
        }
    }

    public static void main(String[] args) {

        UserCredentials user = new UserCredentials("khushi", "secret123");
        String logData = "System Log";

        process(user);
        process(logData);
    }
}

