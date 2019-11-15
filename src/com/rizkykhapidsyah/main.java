package com.rizkykhapidsyah;

public class main {
    public static void main(String[] args) {
        System.out.println("Awal Program");

        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("DoWhile ke: " + a);

            if (a == 10) {
                kondisi = false;
            }

        } while (kondisi);

        System.out.println("Akhir Program");
    }
}
