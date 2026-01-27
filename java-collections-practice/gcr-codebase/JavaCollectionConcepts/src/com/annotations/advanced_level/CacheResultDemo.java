package com.annotations.advanced_level;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheResultDemo {

    // 1️⃣ Define custom annotation
    @Retention(RetentionPolicy.RUNTIME)
    @interface CacheResult {
    }

    // 2️⃣ Class with expensive computation
    static class ExpensiveService {

        @CacheResult
        public int calculateSquare(int number) {
            System.out.println("Computing square for " + number + "...");
            try {
                Thread.sleep(2000); // Simulate expensive computation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return number * number;
        }
    }

    // 3️⃣ Cache storage
    static class CacheManager {
        private static final Map<String, Object> cache = new HashMap<>();

        public static Object invokeWithCache(Object obj, String methodName, Object... args) {
            try {
                Method method = obj.getClass().getDeclaredMethod(methodName, int.class);

                // Create unique cache key
                String cacheKey = methodName + "_" + args[0];

                // Check if method is cacheable
                if (method.isAnnotationPresent(CacheResult.class)) {

                    // Return cached value if present
                    if (cache.containsKey(cacheKey)) {
                        System.out.println("Returning cached result for " + args[0]);
                        return cache.get(cacheKey);
                    }

                    // Compute and cache result
                    Object result = method.invoke(obj, args);
                    cache.put(cacheKey, result);
                    return result;
                }

                // If not annotated, just invoke
                return method.invoke(obj, args);

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    // 4️⃣ Main method to test caching
    public static void main(String[] args) {

        ExpensiveService service = new ExpensiveService();

        long start, end;

        start = System.currentTimeMillis();
        System.out.println("Result: " +
            CacheManager.invokeWithCache(service, "calculateSquare", 5));
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms\n");

        start = System.currentTimeMillis();
        System.out.println("Result: " +
            CacheManager.invokeWithCache(service, "calculateSquare", 5));
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}

