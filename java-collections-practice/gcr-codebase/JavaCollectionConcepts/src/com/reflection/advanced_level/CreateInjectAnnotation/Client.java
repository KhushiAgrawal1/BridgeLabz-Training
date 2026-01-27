package com.reflection.advanced_level.CreateInjectAnnotation;

public class Client {

    @Inject
    private ServiceA serviceA;

    @Inject
    private ServiceB serviceB;

    public void runServices() {
        serviceA.doService();
        serviceB.doService();
    }
}
