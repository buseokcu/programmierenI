package lektion6;

public class ubung1 {

    public static void Runden(double b){

        int c = (int) (b*10);

        double mod = c % 10;

        if(mod>=5){
            c = (c / 10) + 1;
            System.out.println(b + " wird auf " + c + " aufgerundet");
        }
        else{
            c = (c / 10);
            System.out.println(b + " wird auf " + c + " abgerundet");
        }
    }

    public static void main(String[] args){
        Runden(5.7);
        Runden(3.5);
        Runden(3.2);
        Runden(14.869);

    }
}
