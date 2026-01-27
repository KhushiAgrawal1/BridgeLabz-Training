package com.reflection.intermediate_level.AccessandModifyStaticFields;

public class Configuration {

    private static String API_KEY = "OLD_KEY";

    // Optional getter for verification
    public static String getApiKey() {
        return API_KEY;
    }
}
