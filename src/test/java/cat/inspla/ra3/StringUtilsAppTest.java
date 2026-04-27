package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsAppTest {

    private final StringUtilsApp utils = new StringUtilsApp();

    @ParameterizedTest
    @CsvSource({
            "'hola   mon', 'hola mon'",
            "'   hola    mon   ', 'hola mon'",
            "'hola', 'hola'"
    })
    void normalizeSpacesRedueixEspaisMultiples(String input, String expected) {
        assertEquals(expected, utils.normalizeSpaces(input));
    }

    @ParameterizedTest
    @CsvSource({
            "'a    b    c', 'a b c'",
            "'   test    amb   espais   ', 'test amb espais'",
            "'java     junit', 'java junit'"
    })
    void normalizeSpacesCasosExtra(String input, String expected) {
        assertEquals(expected, utils.normalizeSpaces(input));
    }
}