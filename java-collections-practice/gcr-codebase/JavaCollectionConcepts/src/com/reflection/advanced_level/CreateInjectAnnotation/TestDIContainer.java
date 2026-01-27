package com.reflection.advanced_level.CreateInjectAnnotation;

public class TestDIContainer {

    public static void main(String[] args) {
        // Create Client instance with dependencies injected
        Client client = SimpleDIContainer.createInstance(Client.class);

        // Run methods to verify dependencies are injected
        client.runServices();
    }
}

