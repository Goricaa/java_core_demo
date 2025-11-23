package com.academy.operatori;

/**
 * 1.+ -> Unarni plus operator inicira da se radi o pozitivnom broju
 * 2. - -> Unarni minus operator
 * 3. ++ ->inkrement
 *
 *      3.1. pre inkrement
 *      3.2.  post inkrement
 * 4. --
 *     4.1. pre
 *     4.2. post
 * 5. invertor/ komplement
 */

public class UnaryDemo {
    public static void main(String[] args) {
int number = 23;
 number++; // number = number + 1; POSTINKREMENT;
        System.out.println(number);
        number = 23;
        ++number; // POSTINKREMENT;
        System.out.println(number);

        int number3 = 23;
        System.out.println(number3++);// 1. posalji u konzolu 23->2. nakon slanja u konzolu uvecaj za 1=24
        System.out.println(++number3);//1.uvecaj za 1= 25-> 2. posalji u konzolu 25 ; cesto bude na Oracle

int broj = 24;
System.out.println(broj--); // isto kao ranije, prvo 24 ispis, pa umanjim za 1
System.out.println(--broj); // umanjeni broj 23 -1

        boolean succes = true; // ako nije ta vrijednost, bice ona druga; bez ! dobijam true
        System.out.println(!succes);



    }
}
