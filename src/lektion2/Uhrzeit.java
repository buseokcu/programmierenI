package lektion2;

import java.time.LocalTime;

public class Uhrzeit {
    public static void main(String[] args) {

        LocalTime aktuelle = LocalTime.now();
        System.out.println(aktuelle);

        int stunde = aktuelle.getHour();
        int minuten = aktuelle.getMinute();
        int sekunden = aktuelle.getSecond();

        int sekundenSeitMitternacht = (stunde * 60 * 60) + (minuten * 60) + sekunden;
        int verbleibendenSekunden = (((24 * 60 * 60) - (stunde * 60 * 60)) + ((60 * 60) - (minuten * 60)) + (60 - sekunden));
        double prozent = (sekundenSeitMitternacht / 86400.0) * 100;

        System.out.println("die Anzahl der Sekunden seit Mitternacht: " + sekundenSeitMitternacht);
        System.out.println("die Anzahl der verbleibenden Sekunden für diesen Tag: " + verbleibendenSekunden);
        System.out.println("wie viel Prozent des Tages schon vergangen sind: " + "%" + prozent);
    }
}
