package lambda_expressions.Notification_Filtering;

class Alert {
    String message;
    String type;   // EMERGENCY, MEDICINE, GENERAL

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String toString() {
        return type + " : " + message;
    }
}
