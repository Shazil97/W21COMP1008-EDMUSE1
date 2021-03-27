package models;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate birthday;


    public Person(String firstname, String lastname, String address, LocalDate birthday) {
        setFirstName (firstname);
        setLastName (lastname);
        setAddress (address);
        setBirthday (birthday);
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        firstname = firstname.trim();
        if (firstname.length()>2)
          this.firstName = firstname;
        else
            throw new IllegalArgumentException("first name required at least 2 character");
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
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

    /**
    * This method will return the amount of complete years since the birthday to the current date
     *
     */

    public int getAge()
    {
        return Period.between(birthday, LocalDate.now()).getYears();
    }
}
