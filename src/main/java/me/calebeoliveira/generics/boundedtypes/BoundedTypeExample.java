package me.calebeoliveira.generics.boundedtypes;

class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(age, otherPerson.getAge());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class BoundedTypeExample {
    public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {
        if(num1.compareTo(num2) < 0) {
            return num1;
        }

        return num2;
    }

    public static void main(String[] args) {
        Integer a = null;
        System.out.println(calculateMin(new Person(92, "Adam"), new Person(78, "Kevin")));
    }
}
