package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(7, "cristiano", "ronaldo");
    }

    @Test
    void testUser() {
        assertEquals(7, user.getNumber());
        assertEquals("Cristiano", user.getName());
        assertEquals("Ronaldo", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Cristiano Ronaldo", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("C.R", user.initials());
    }

    @Test
    void testGetNumber() {
        assertEquals(7, user.getNumber());
    }

    @Test
    void testGetName() {
        assertEquals("Cristiano", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Ronaldo", user.getFamilyName());
    }

    @Test
    void testGetFullNameUpperCase() {
        assertEquals("CRISTIANO RONALDO", user.getFullNameUpperCase());
    }

}
