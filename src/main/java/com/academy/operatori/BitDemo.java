package com.academy.operatori;
// operatori na nivou bita - ne koristiti
public class BitDemo {
    public static void main(String[] args) {
        // 00000..11 -> 0b00100
        //              0b01000
        int number = 4;
        number = number<<1; // siftanje jednog mjesta ulijevo ili udesno, tj pomjeraj 0 i 1
        System.out.println(number);
        /**
         * 4*2na prvu, to je 8.
         * ako siftamo <<2, to je kao da smo pomnozili 4*2na kvadrat, to je 16.
         * ako siftamo <<3, to je kao da smo pomnozili 4*2na trecu, to je 32.
         * ovo je bitno da znamo samo da postoji, nije moranje da znamo, naucni domen, komm prof.
         * ako siftamn u desno, onda se dijeli;
         * npr >>1, to je kao da smo podijelili 4/2 na prvu, to je 2.
         * >>2, to je kao da smo podijelili 4/2 na drugu, to je 1.
         * bitno je samo da znamo citati.
         * moze biti Oracle test
         */
    }
}
