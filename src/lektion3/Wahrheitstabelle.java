package lektion3;

import java.util.Scanner;

public class Wahrheitstabelle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Erstes Zeichen eingeben (f/t): ");
        char zeichen1 = scanner.next().charAt(0);
        System.out.print("Zweites Zeichen eingeben (f/t): ");
        char zeichen2 = scanner.next().charAt(0);

        if (zeichen1 == 'f' && zeichen2 == 'f') {
            System.out.println("0");
        } else if (zeichen1 == 'f' && zeichen2 == 't') {
            System.out.println("1");
        } else if (zeichen1 == 't' && zeichen2 == 'f') {
            System.out.println("2");
        } else if (zeichen1 == 't' && zeichen2 == 't') {
            System.out.println("3");
        } else {
            throw new RuntimeException("Ungültige Eingabe. Bitte geben Sie 'f' oder 't' ein.");
        }
    }
}
