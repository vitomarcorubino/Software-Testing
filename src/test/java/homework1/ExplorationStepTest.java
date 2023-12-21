package homework1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe di unit tests per la classe CaseUtils.
 *
 * Questa classe non è completa di tutti i test case progettati ma include soltanto quelli indicati nel secondo
 * step del workflow di specification-based testing, cioè quello di esplorazione.
 */
class ExplorationStepTest {
    CaseUtils caseUtils = new CaseUtils();
    String str;
    boolean capitalizeFirstLetter;
    char[] delimiters;


    @Test
    void testSimpleCase() {
        str = "integrazione e test di sistemi software";
        capitalizeFirstLetter = false;

        assertEquals("integrazioneETestDiSistemiSoftware", caseUtils.toCamelCase(str, capitalizeFirstLetter));
    }

    @Test
    void testCapitalizeFirstLetter() {
        str = "integrazione e test di sistemi software";
        capitalizeFirstLetter = true;

        assertEquals("IntegrazioneETestDiSistemiSoftware", caseUtils.toCamelCase(str, capitalizeFirstLetter));
    }

    @Test
    void testSimpleCaseWithoutDelimiters(){
        str = "stringasenzaspazi";
        capitalizeFirstLetter = false;

        assertEquals("stringasenzaspazi", caseUtils.toCamelCase(str, capitalizeFirstLetter));
    }

    @Test
    void testSimpleCaseWithDelimiter(){
        str = "stringasenzaspazi";
        capitalizeFirstLetter = false;
        delimiters = new char[]{'a'};

        assertEquals("stringSenzSpZi", caseUtils.toCamelCase(str, capitalizeFirstLetter, delimiters));
    }
}