package lektion3;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine ganze Zahl ein: ");
        double zahl = scanner.nextDouble();

        if (zahl % 7.0 == 0) {
            System.out.println(zahl + " ist ganzzahlig durch 7 teilbar.");
        } else {
            System.out.println(zahl + " ist nicht ganzzahlig durch 7 teilbar.");
        }
    }
}
