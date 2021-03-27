package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
       private Person person;
    @BeforeEach
    void setUp() {
        person = new Person("Jaret", "Wright","11 Mapleview Drive West", LocalDate.of(1980,
                1, 26));
    }

    @Test
    void setFirstname() {
        person.setFirstName("Alfred");
        assertEquals("Alfred",person.getFirstname());
    }

    @Test
    void setLastname() {
    }

    @Test
    void setAddress() {
    }

    @Test
    void setBirthday() {
    }

    @Test
    void getAge() {
    }
}