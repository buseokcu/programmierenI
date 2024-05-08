package lektion3;

import java.util.Scanner;

public class Matrikelnummer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Matrikelnummer: ");
        int MatrikelNm = scanner.nextInt();

        String MatrikelNmStr = String.valueOf(MatrikelNm);
        int lange = MatrikelNmStr.length();
        String ersteZweiStelle = MatrikelNmStr.substring(0, 2);
        System.out.println(ersteZweiStelle);

        if ((lange == 7) && (ersteZweiStelle.equals("50") || ersteZweiStelle.equals("51") || ersteZweiStelle.equals("60"))) {
            System.out.println("Gültige Matrikelnummer");
        } else {
            System.out.println("Ungültige Matrikelnummer");
        }
    }
}
