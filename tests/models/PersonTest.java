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
    void setFirstNameInvalid(){
        assertThrows(IllegalArgumentException.class, () ->
                 person.setFirstName(""));
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
        assertEquals(47, person.getAge());
    }
}