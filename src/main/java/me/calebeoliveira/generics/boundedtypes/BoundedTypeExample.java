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

    private static <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
//        System.out.println(calculateMin(new Person(92, "Adam"), new Person(78, "Kevin")));
        System.out.println(add(10, 30f));
    }
}
