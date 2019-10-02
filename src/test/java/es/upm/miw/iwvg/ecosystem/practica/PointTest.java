package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;

    @BeforeEach
    void before() {
        point = new Point(2, 3);
    }

    @Test
    void testGetX() {
        assertEquals(2, point.getX());
    }

    @Test
    void testGetY() {
        assertEquals(3, point.getY());
    }

    @Test
    void testSetX() {
        Point point = new Point();
        point.setX(7);
        assertEquals(7, point.getX());
    }

    @Test
    void testSetY() {
        Point point = new Point();
        point.setY(4);
        assertEquals(4, point.getY());
    }

    @Test
    void testPointIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
    }

    @Test
    void testPointInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    void testPoint() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void testModule() {
        assertEquals(3.6055, point.module(), 10e-5);
    }

    @Test
    void testPhase() {
        assertEquals(0.9828, point.phase(), 10e-5);
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    void testMoveHorizontally() {
        point.moveHorizontally(5);
        assertEquals(7, point.getX());
    }

    @Test
    void testMoveVertically() {
        point.moveVertically(5);
        assertEquals(8, point.getY());
    }

}