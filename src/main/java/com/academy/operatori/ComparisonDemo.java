package com.academy.operatori;

import java.util.Scanner;

public class ComparisonDemo {
    /**
     * OPERATORI POREDJENJA
     *1. == equal to
     *2. != not equal
     *3. > greater than
     *4. < less than
     *5. >=
     *6. <=
     */
    public static void main(String[] args) {
        System.out.println("Unesite broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj:");
        int number2 = new Scanner(System.in).nextInt();
        if (number1 == number2) { // if mora imati true ili false
            System.out.println("Brojevi su jednaki");
        }
if (number1 != number2) {
    System.out.println("Brojevi nisu jednaki");
}
if (number1 > number2) {
    System.out.println("Prvi broj je veci od drugog");
}
if  (number1 < number2) {
    System.out.println("Prvi broj je manji od drugog");
}
if (number1 >= number2) {
    System.out.println("Prvi broj je veci ili bar jednak od drugog");
}
if (number1 <= number2) {
    System.out.println("Prvi broj je manji ili bar jednak od drugog");
}
    }
}
