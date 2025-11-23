package com.academy.four;

public class FourDemo {
    public static void main(String[] args) {

        int firstNumber = 23; // DECIMALNI ZAPIS VRIJEDNOSTI
        System.out.println(firstNumber);
        int secondNumber = 0X1a; // HEKSADECIMALNI ZAPIS VRIJEDNOSTI
        System.out.println(secondNumber);
        //26 binarno
        int thirdNumber = 0b11010;
        System.out.println(thirdNumber);

        long creditCardNumber = 1234_5678_9191L;
        System.out.println(creditCardNumber);
        long hexNumber = 0xFF_EC; //samo da znam da postoji
        System.out.println(hexNumber);
    }
}
