import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        int indexNumber = 56694;
        int lastIndexNumber = (Math.abs(indexNumber) % 10);
        for (int i = 100; i >= 0; i--) {
            if ( i % lastIndexNumber == 0) {
                System.out.println(i + " : " + lastIndexNumber + " = " + i / lastIndexNumber);
            }
        }

        System.out.println("####################################################");
        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++){
            System.out.println("Proszę podać liczbę");
            tab[i] = scanner.nextInt();
        }
        System.out.println("Podane liczby powiększone o 11: ");
        for(int z : tab){
            System.out.println(z + 11);
        }
    }
}
