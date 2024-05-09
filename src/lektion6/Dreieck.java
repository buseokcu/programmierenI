package lektion6;

public class Dreieck {
    public static void mittedreieck(int z){
        for (int i = 1; i <= z; i++){
            for (int c = z - i; c >= 0; c-- ){
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++){
                System.out.print('*' + " ");
            }
            System.out.println(" ");
        }
    }
    public static void linkendreieck(int z){
        for (int i = 1; i <= z; i++){
            for (int a = 1; a <= i; a++){
                System.out.print('*' + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        linkendreieck(7);
        mittedreieck(7);
    }
}
