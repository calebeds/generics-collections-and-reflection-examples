package me.calebeoliveira.collections.map;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        // hashCode = hash-function
        // it calculates an array index based on the key itself (keys==Person objects)
        // avoid clustering with prime numbers
        return Objects.hash(name, age);
    }

    // THERE ARE SOME RULES
    // 1.) if two objects are equal then they must have the same hash code
    // 2.) if two objects have the same hash code they may or may not be equal

    @Override
    // because in a hashmap it may happen (collisions)
    // that we have to find the item (Person) is a linked list
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return age == person.age && Objects.equals(name, person.name);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
