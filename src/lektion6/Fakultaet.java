package lektion6;

import java.util.Scanner;

public class Fakultaet {

    public static long Fakultat(int a) {
        long b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        return b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte ein Zahl: ");
        int a = scanner.nextInt();
        System.out.println(Fakultat(a));
    }
}
