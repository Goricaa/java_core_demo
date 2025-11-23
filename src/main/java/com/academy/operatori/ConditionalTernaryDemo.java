package com.academy.operatori;

import java.util.Scanner;

public class ConditionalTernaryDemo {
    public static void main(String[] args) {
        System.out.println("Koliko je 2+2?");
        int result = new Scanner(System.in).nextInt();
        boolean uslovTacnosti = result == 4;
        // String message = uslovTacnosti ? "Tacno" : "Netacno"; drugi nacin-ternarni, skraceno
        String message;
        if (uslovTacnosti == true) {
            message = "Tacno";
        }else {
            message = "Netacno";
        }
        System.out.println(message);
    }
}
