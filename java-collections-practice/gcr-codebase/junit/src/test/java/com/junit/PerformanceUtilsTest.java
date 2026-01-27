package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class PerformanceUtilsTest {

    PerformanceUtils utils = new PerformanceUtils();

    // ❌ This test will FAIL because method takes 3 seconds
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() throws InterruptedException {
        utils.longRunningTask();
    }

    // ✅ This test will PASS
    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void testLongRunningTaskWithinTime() throws InterruptedException {
        assertEquals("Completed", utils.longRunningTask());
    }
}

