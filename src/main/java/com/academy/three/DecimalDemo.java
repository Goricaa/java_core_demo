package com.academy.three;

public class DecimalDemo {
    public static void main(String[] args) {
        /**
         * U Javi imamo 2 primitivna tipa za decimalne brojeve
         * float -> 32bitni
         * double -> 64bitni (DEFAULT)
         *
         */
        float floatNumbr = (float)10.3; // LOSIJI NACIN
        float floatNumber3 = 10.3F; // BOLJI NACIN

        double doubleNumber = 10.3;

        /**
         * Nikada ne koristiti float i double za finansijske ili neke proracune
         * koji zahtjevaju decimalnu preciznost
         *
         * BigDecimal-> PRECIZNOST
         */
        double number1 = 0.1;
        double number2 = 0.2;
        double suma = number1 + number2;
        //suma = Math.round(suma * 100.0) / 100.0;

        System.out.println("Da li je suma jednaka 0.3 ? Odgovor:" + (suma == 0.3));
        System.out.println("Suma =" +suma);

        double broj1 = 0.3;
        double broj2 = 0.2;
        double zbir = broj1 + broj2;
        System.out.println("Da li je zbir jednaka 0.5? Odgovor:" + (zbir == 0.5));
        System.out.println("Zbir =" +zbir);
    }
}
