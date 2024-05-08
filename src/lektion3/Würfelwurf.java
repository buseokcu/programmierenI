package lektion3;

public class Würfelwurf {
    public static void main(String[] args) {

        double randomZahl = Math.random();

        int wurf = (int) ((randomZahl * 6) + 1);

        switch (wurf) {
            case 1:
                System.out.println("Eins gewürfelt");
                break;
            case 2:
                System.out.println("Zwei gewürfelt");
                break;
            case 3:
                System.out.println("Drei gewürfelt");
                break;
            case 4:
                System.out.println("Vier gewürfelt");
                break;
            case 5:
                System.out.println("Fünf gewürfelt");
                break;
            case 6:
                System.out.println("Sechs gewürfelt");
                break;
            default:
                System.out.println("Ungültiger Wurf");
        }
    }
}
