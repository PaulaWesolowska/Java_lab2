import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */


        Scanner scan = new Scanner((System.in));
        System.out.print("Podaj liczbę: ");
        int a = scan.nextInt();
        int n = a%2;
        switch(n){
            case 0:
                System.out.println("Podana liczba jest podzielna przez 2");
                break;
            default:
                System.out.println("Podana liczba nie jest podzielna przez 2");
                break;
        }
        int m = a%7;
        switch(m){
            case 0:
                System.out.println("Podana liczba jest podzielna przez 7");
                break;
            default:
                System.out.println("Podana liczba nie jest podzielna przez 7");
                break;
        }

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablica = {0, 0, 0, 0, 0, 0};
        /* toCharArray() - metoda zamienia String na tablicę char[] */
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablica[0];
                    break;
                case 'p':
                    ++tablica[1];
                    break;
                case 'x':
                    ++tablica[2];
                    break;
                case 'z':
                    ++tablica[3];
                    break;
                case 'q':
                    ++tablica[4];
                    break;
                default:
                    ++tablica[5];
            }
        }
        System.out.printf("\nLiczba występuje:\no: %d - razy\np: %d - razy\nx: %d - razy\nz: %d - razy\nq: %d - razy",
                tablica[0], tablica[1], tablica[2], tablica[3], tablica[4]);
        System.out.println("\n\nPozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q' jest " + tablica[5]);
    }
}
