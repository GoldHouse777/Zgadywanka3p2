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
        if(wpisanaLiczba == wylosowanaLiczba){
            System.out.println("wygrana");
        }
        else{
            System.out.println("pudło");
        }
        //określić jak duża różnica pomiędzy wpisaną i wylosowaną
        //wyrażenie warunkowe zwraca wartość

        int roznica = wpisanaLiczba >wylosowanaLiczba ? wpisanaLiczba - wylosowanaLiczba : wylosowanaLiczba - wpisanaLiczba;
        System.out.println("Pomyłka o "+roznica);

        roznica = roznica/10; //dzielenie całkowite
        switch (roznica){
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
        }


    }
}