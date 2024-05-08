package lektion3;

import java.util.Scanner;

public class PizzaRechner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Durchmesser für Pizza1: ");
        int drchmssrP1 = scanner.nextInt();
        System.out.println("Bitte geben Sie die Preis für Pizza1: ");
        double preisP1 = scanner.nextDouble();

        System.out.println("Bitte geben Sie die Durchmesser für Pizza2: ");
        int drchmssrP2 = scanner.nextInt();
        System.out.println("Bitte geben Sie die Preis für Pizza2: ");
        double preisP2 = scanner.nextDouble();

        double flaecheP1 = Math.PI * Math.pow(drchmssrP1, 2);
        double flaecheP2 = Math.PI * Math.pow(drchmssrP2, 2);

        double groPreP1 = flaecheP1 / preisP1;
        double groPreP2 = flaecheP2 / preisP2;

        System.out.println("Pizza 1: ");
        System.out.println("Flaeche: " + flaecheP1 + " cm^2");
        System.out.println("Preis: " + preisP1 + " Euro");
        System.out.println("Größen‐/Preisverhältnis: " + groPreP1);

        System.out.println("\n");

        System.out.println("Pizza 2: ");
        System.out.println("Flaeche: " + flaecheP2 + " cm^2");
        System.out.println("Preis: " + preisP2 + " Euro");
        System.out.println("Größen‐/Preisverhältnis: " + groPreP2);

        if (groPreP1 > groPreP2) {
            System.out.println("\nPizza 1 hat das bessere Größen‐/Preisverhältnis.");
        } else if (groPreP2 > groPreP1) {
            System.out.println("\nPizza 2 hat das bessere Größen‐/Preisverhältnis.");
        } else {
            System.out.println("\nBeide Pizzen haben das gleiche Größen‐/Preisverhältnis.");
        }

    }
}
