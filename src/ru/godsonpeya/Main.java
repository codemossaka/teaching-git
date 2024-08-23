package ru.godsonpeya;

public class Main {
    public static void main(String[] args) {
//        Person person1 = new Person();
        Person person2 = new Person(25);
//        Person person3 = new Person("John");
//        Person person4 = new Person("John", 25);

        System.out.printf(" name %s et age %s",person2.getName(), person2.getAge());
    }
}