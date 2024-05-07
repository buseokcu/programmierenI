package lektion2;

import java.util.Scanner;

public class KreisundKugel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;

        System.out.println("Was ist der Radius?");
        double r = scanner.nextDouble();

        double flaeche = pi * r * r;
        double umfang = pi * 2 * r;
        double volume1 = (4 / 3) * pi * Math.pow(r, 3);

        System.out.println("Kreisflaeche: " + flaeche);
        System.out.println("Kreisumfang: " + umfang);
        System.out.println("Volume1: " + volume1);
    }
}
