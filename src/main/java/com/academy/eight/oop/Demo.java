package com.academy.eight.oop;

public class Demo {
    public static void main(String[] args) {
        int number = 23;
        number = 13;

        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 13;
        numbers[2] = 10;

        Person person = new Person();
        person.nin = 12134;
        person.name = "Aleksandar";
        person.surname = "Petković";

        // Otkud nama hashCode() funkcija
        int hashCode = person.hashCode();
        String personString = person.toString();
        System.out.println(hashCode + " --> " + personString);
    }
}
