package lektion2;

import java.util.Scanner;

public class pqFormel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("p Werte: ");
        double p = scanner.nextDouble();
        System.out.println("q Werte: ");
        double q = scanner.nextDouble();

        double s = (Math.pow((p / 2), 2)) - q;

        if (s >= 0) {
            double sq = Math.sqrt(s);

            double x1 = ((-(p / 2)) + sq);
            double x2 = ((-(p / 2)) - sq);

            System.out.println("Erste x Wert: " + x1);
            System.out.println("Zweite x Wert: " + x2);

        } else {
            System.out.println("Die Diskriminante ist negativ. Die Gleichung hat keine reellen Lösungen.");
        }

    }
}
