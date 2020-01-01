package com.epam.builder;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Person.PersonBuilder builder() {
        return new Person.PersonBuilder();
    }

    public Person.PersonBuilder toBuilder() {
        return (new PersonBuilder())
                .firstName(this.firstName)
                .lastName(this.lastName)
                .age(this.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;

        public Person.PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Person.PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person.PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this.firstName, this.lastName, this.age);
        }

        @Override
        public String toString() {
            return "PersonBuilder{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
