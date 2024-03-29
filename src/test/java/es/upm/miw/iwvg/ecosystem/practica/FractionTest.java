package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(5, 10);
    }

    @Test
    void testFractionIntInt() {
        assertEquals(5, fraction.getNumerator());
        assertEquals(10, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.5, fraction.decimal());
    }

    @Test
    void testGetNumerator() {
        assertEquals(5, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(10, fraction.getDenominator());
    }

    @Test
    void testIsPropia() {
        assertEquals(true, fraction.isPropia());
    }

    @Test
    void testIsInpropia() { assertEquals(false, fraction.isInpropia());}

    @Test
    void testMultiplyFraction() {
        Fraction multiplier = new Fraction(2, 2);
        fraction.multiplyFraction(multiplier);
        assertEquals(10, fraction.getNumerator());
        assertEquals(20, fraction.getDenominator());
    }

}
