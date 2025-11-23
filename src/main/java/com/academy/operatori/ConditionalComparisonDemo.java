package com.academy.operatori;

import java.util.Scanner;

/**
 * && -> AND
 *
 * || -> OR
 */

public class ConditionalComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesite jedan broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite drugi broj:");
        int number2 = new Scanner(System.in).nextInt();
        if ((number1 == 23) && (number2<10)){ // oba izraza moraju biti zadovoljena
            /**  if ((number1 == 23) && (number2++ <10)){
             * npr ako prvi slucaj unesem 23, u drugom dijelu gdje OR dobicu number2 uvecan za +1
             * ali ako kao prvi broj upisem 24, u OR ce ostati neuvecan drugi broj
             * jer nije se ispunio prvi uslov u naredbi AND
             * bitno za znati, Oracle
             *
             */
                System.out.println("Michael Jordan i neki fudbaler");

            }

            if ((number1 == 23) || (number2<10)){  // samo jedan izraz mora biti zadovoljen
                System.out.println("Ili je Michael Jordan ili je neki fudbaler");
            }
        }
}
