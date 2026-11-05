package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Hledamcislo hadanka= new Hledamcislo();

        int cislo;
        boolean nalezeno = false;


        while(!nalezeno){
            System.out.println("Zadej číslo:");
            cislo = s.nextInt();

        if (hadanka.naslo(cislo))   {
            System.out.println("uhodl jsi to");
            break;
        }
        if (hadanka.jeVetsi(cislo)) {
            System.out.println("cislo je mensi");
        } else {
            System.out.println("cislo je vetsi");
        }
            System.out.printf("pocet pokusu:" + hadanka.getPocetPokusu());


        }


    }




}

