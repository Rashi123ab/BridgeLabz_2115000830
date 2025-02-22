import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private TemperatureConverter temperatureConverter;

    @BeforeEach
    void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, temperatureConverter.celsiusToFahrenheit(0), 0.01, "0°C should be 32°F");
        assertEquals(212.0, temperatureConverter.celsiusToFahrenheit(100), 0.01, "100°C should be 212°F");
        assertEquals(98.6, temperatureConverter.celsiusToFahrenheit(37), 0.01, "37°C should be 98.6°F");
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, temperatureConverter.fahrenheitToCelsius(32), 0.01, "32°F should be 0°C");
        assertEquals(100.0, temperatureConverter.fahrenheitToCelsius(212), 0.01, "212°F should be 100°C");
        assertEquals(37.0, temperatureConverter.fahrenheitToCelsius(98.6), 0.01, "98.6°F should be 37°C");
    }
}