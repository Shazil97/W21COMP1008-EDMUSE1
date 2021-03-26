package models;

import java.time.LocalDate;

public class Person {
    private String firstname;
    private String lastname;
    private String address;
    private LocalDate birthday;


    public Person(String firstname, String lastname, String address, LocalDate birthday) {
        setFirstname (firstname);
        setLastname (lastname);
        setAddress (address);
        setBirthday (birthday);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
