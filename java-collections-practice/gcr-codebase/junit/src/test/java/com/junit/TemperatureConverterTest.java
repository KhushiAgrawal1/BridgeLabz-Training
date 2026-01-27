package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    // ✅ Celsius to Fahrenheit tests
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
        assertEquals(68.0, converter.celsiusToFahrenheit(20), 0.001);
    }

    // ✅ Fahrenheit to Celsius tests
    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
        assertEquals(20.0, converter.fahrenheitToCelsius(68), 0.001);
    }
}

