package lektion3;

import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie bitte ein Jahr: ");
        int jahr = scanner.nextInt();

        int vierjahr = jahr % 4;
        int durchhundert = jahr % 100;
        int durchvierhundert = jahr % 400;

        if (vierjahr == 0) {
            if (durchhundert == 0) {
                if (durchvierhundert == 0) {
                    System.out.println(jahr + " ist ein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber auch durch 400");
                } else {
                    System.out.println(jahr + " ist kein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber nicht durch 400");
                }
            } else {
                System.out.println(jahr + " ist ein Schaltjahr, da ganzzahlig durch 4 teilbar");
            }
        } else {
            System.out.println(jahr + " ist kein Schaltjahr, da nicht ganzzahlig durch 4 teilbar");
        }
    }
}
