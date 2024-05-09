package lektion6;

import java.util.Scanner;

public class ubung5 {
    public static int Rekursion(int x, int n){
        if(n == 0){
            return 1; // x^0 = 1
        } else if (n > 0) {
            return x * Rekursion(x, n - 1); // x^n = x * x^(n-1)
        } else{
            return 1 / Rekursion(x, -n); // x^(-n) = 1 / x^n
            }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Basis ein: ");
        int x = scanner.nextInt();
        System.out.println("Geben Sie den Exponenten ein: ");
        int n = scanner.nextInt();

        int result = Rekursion(x, n);
        System.out.println(x + " hoch " + n + " ist " +  result);

    }
}



