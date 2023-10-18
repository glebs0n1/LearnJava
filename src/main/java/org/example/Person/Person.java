package org.example.Person;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private LocalDate birthDate;

    public Person(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    public static void main(String[] args) {
        Person person = new Person(LocalDate.of(2000, 02, 10));
        int age = person.calculateAge();
        System.out.println("Age: " + age);
    }
}
