package com.Marker_Interfaces.Data_Serialization_for_Backup;

class UserData implements BackupSerializable {
    String username;
    String email;

    UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }
}

