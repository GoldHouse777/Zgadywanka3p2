import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("na lekcji programowanka");

        int wylosowanaLiczba = (int) (Math.random() * 100 + 1);//rzutowanie
        /*
        typy proste przechowują tylko wartość
        logiczne boolean
        całkowite byte, short, int, long
        rzeczywiste float, double
        znakowy char

        typy złożone obiekty własności i metody
        String Integer Kosc
        */

        System.out.println(wylosowanaLiczba);


        //wczytywanie z klawiatury
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int wpisanaLiczba = klawiatura.nextInt();

        //instrukcja warunkowa
        if (wpisanaLiczba == wylosowanaLiczba) {
            System.out.println("wygrana");
        } else {
            System.out.println("pudło");
        }
        //określić jak duża różnica pomiędzy wpisaną i wylosowaną
        //wyrażenie warunkowe zwraca wartość

        int roznica = wpisanaLiczba > wylosowanaLiczba ? wpisanaLiczba - wylosowanaLiczba : wylosowanaLiczba - wpisanaLiczba;
        System.out.println("Pomyłka o " + roznica);

        roznica = roznica / 10; //dzielenie całkowite
        switch (roznica) {
            case 0:
                System.out.println("Bardzo blisko");
                break;
            case 1:
                System.out.println("Blisko");
                break;
            case 2:
                System.out.println("Dość blisko");
                break;
            default:
                System.out.println("Słabo");
        }
        //wyrażenie switch
        System.out.println(
            switch  (roznica){
                case 0->"Bardzo dobrze";
                case 1->"Dobrze";
                case 2->"Dość dobrze";
                default -> "Słabo";

            }
        );

        //zgadywanie 10 razy
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();
            if (wpisanaLiczba == wylosowanaLiczba){
                System.out.println("Wygrana");
                break;
            }
        }

        //tak dlugo az sie uda
        do{
            System.out.println("podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();
            if (wpisanaLiczba>wylosowanaLiczba){
                System.out.println("Wpisano za duzo");
            }
            else if(wpisanaLiczba<wylosowanaLiczba){
                System.out.println("wpisano za mało");
            }
        }
        while(wpisanaLiczba != wylosowanaLiczba);
        System.out.println("wygrana");

        //pierwsze zadanie domowe zadanie8
        //Wygeneruj hasło losowo. Dlugosc powinna wynosic 20 znakow
        String haslo ="";
        String maleLitery = "qwertyuiopasdfghjklzxcvbnm";
        String duzeLitery = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String znakiSpecjalne = "!@#$%^&*()<>?|:}{|}{+_";
        String cyfry = "0123456789";
        int losowa;

        for (int i = 0; i < 5; i++) {
            losowa = (int) (Math.random()*maleLitery.length());
            haslo = haslo + maleLitery.charAt(losowa);
            losowa = (int) (Math.random()*maleLitery.length());
            haslo = haslo + duzeLitery.charAt(losowa);
            losowa = (int) (Math.random()*maleLitery.length());
            haslo = haslo + znakiSpecjalne.charAt(losowa);
            losowa = (int) (Math.random()*maleLitery.length());
            haslo = haslo + cyfry.charAt(losowa);
        }
        System.out.println("Wygenerowane hasło: "+haslo);
    }
}