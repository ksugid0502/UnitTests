package org.example;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void SetAge(int age) {
        if (age < 0 || age > 200)
            throw new IllegalArgumentException("Age must be between 0 and 200");
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Surname: %s, Age: %d", name, surname, age);
    }
}
