package com.Marker_Interfaces.Data_Serialization_for_Backup;

public class BackupService {

    static void backup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
            // Serialization logic here
        } else {
            System.out.println("Object not eligible for backup");
        }
    }

    public static void main(String[] args) {
        UserData user = new UserData("khushi", "khushi@mail.com");
        String tempData = "Temp File";

        backup(user);
        backup(tempData);
    }
}

