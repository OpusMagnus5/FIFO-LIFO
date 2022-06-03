package com.damian.bodzioch;

import com.damian.bodzioch.queue.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue fifo = new LIFOtable();
        int option;
        do {
            System.out.println("0. Wyjscie");
            System.out.println("1. Printuj");
            System.out.println("2. Dodaj");
            System.out.println("3. Usuń");
            System.out.println("4. Rozmiar");
            System.out.print("Podaj opcję: ");
            option = in.nextInt();
            switch (option){
                case 1:
                    fifo.print();
                    break;
                case 2:
                    System.out.print("Podaj liczbę do kolejki: ");
                    fifo.push(in.nextInt());
                    break;
                case 3:
                    fifo.pop();
                    break;
                case 4:
                    System.out.println(fifo.size());
                    break;
            }
        } while (option != 0);
    }
}
