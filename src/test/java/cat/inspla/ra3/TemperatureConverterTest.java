package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @ParameterizedTest
    @CsvSource({
            "0, 32",
            "100, 212",
            "-40, -40"
    })
    void convertCelsiusToFahrenheitRetornaValorCorrecte(double c, double expected) {
        assertEquals(expected, converter.celsiusToFahrenheit(c));
    }
}