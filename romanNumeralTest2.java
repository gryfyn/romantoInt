import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class romanNumeralTest2 {

    private RomanNumeral romanNumeral;

    @Before
    public void setUp() {
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void testSingleLetters() {
        assertEquals(1, romanNumeral.romanToInt("I"));
        assertEquals(5, romanNumeral.romanToInt("V"));
        assertEquals(10, romanNumeral.romanToInt("X"));
        assertEquals(50, romanNumeral.romanToInt("L"));
        assertEquals(100, romanNumeral.romanToInt("C"));
        assertEquals(500, romanNumeral.romanToInt("D"));
        assertEquals(1000, romanNumeral.romanToInt("M"));
    }

    @Test
    public void testManyLetters() {
        assertEquals(11, romanNumeral.romanToInt("XI"));
    }

    @Test
    public void testSubtractiveNotation() {
        assertEquals(4, romanNumeral.romanToInt("IV"));
        assertEquals(14, romanNumeral.romanToInt("XIV"));
    }

    @Test
    public void testRepetition() {
        assertEquals(2, romanNumeral.romanToInt("II"));
    }

    @Test
    public void testFirstNumber() {
        assertEquals(1, romanNumeral.romanToInt("I"));
    }

    @Test
    public void testInvalidLetter() {
        assertEquals(0, romanNumeral.romanToInt("Z"));
    }

    @Test
    public void testInvalidAndValidLetter() {
        assertEquals(0, romanNumeral.romanToInt("XIZ"));
    }

    

    @Test
    public void testNull() {
        assertEquals(0, romanNumeral.romanToInt(null));
    }
}
