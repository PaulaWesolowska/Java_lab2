public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        int i = 1000;
        int indexNumber = 56694;
        do{ --i;
            if( i % 94 == 0){
                System.out.println("Liczba "+ i +" jest podzielna przez 94");
            }
        } while( i >= 0);


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        boolean a = true;
        boolean b = false;
        while(a){
            System.out.println("Sprawdzam rezultat while (true) -> pętla się nie kończy");
}
        while(b){
            System.out.println("Sprawdzam rezultat while (false) -> wynik nie pokazuje się w ogóle");
        }
    }
}
