package ru.godsonpeya.entity;

public class Person {

    private String name;
    private int age;

    public Person() {
        this("inconnu", 0);
    }

    public Person(String name) {
        this(name, 19);
    }

    public Person(int age) {
        this(null, age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}