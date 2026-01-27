package com.reflection.advanced_level.CustomLoggingProxyUsingReflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxyDemo {

    public static void main(String[] args) {
        // 1️⃣ Real object
        Greeting greeting = new GreetingImpl();

        // 2️⃣ Create proxy
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                greeting.getClass().getClassLoader(),
                greeting.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // Log method call
                        System.out.println("[LOG] Method called: " + method.getName());

                        // Execute the real method
                        return method.invoke(greeting, args);
                    }
                }
        );

        // 3️⃣ Use proxy
        proxyInstance.sayHello("Alice");
        proxyInstance.sayGoodbye("Bob");
    }
}

