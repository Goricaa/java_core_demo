package com.academy.operatori;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
*Aritmeticki operatori:
 * 1. Additive operator
 * 2.Subraction operator
 * 3.Multiplication
 * 4. Division
 * 5.% Reminder, nije djeljenje, nego ostatak od djeljenja
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Dobro Dosli u nas sistem..");
        System.out.println("Molimo Vas unesite prvi broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Molimo Vas unesite drugi broj:");
        int number2 = new Scanner(System.in).nextInt();

        int suma = number1 + number2;
        System.out.println("Suma =" +suma);

        int razlika = number1 - number2;
        System.out.println("Razlika =" + razlika);
        int multiplication = number1 * number2;
        System.out.println("Proizvod =" + multiplication);
        int division = number1 / number2;
        System.out.println("Rezultat dijeljenja =" + division);
        int remainder =  number1 % number2;
        System.out.println("Ostatak od dijeljenja =" + remainder);




    }
}
