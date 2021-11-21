import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        int z = 21;
        int tab1 [] = new int [z];
        boardCompletion1(tab1);
        displayArray1(tab1);


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        String[] tab2 = new String[6];
        boardCompletion2(tab2);
        displayArray2(tab2);


        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        String firstName = "Paula";
        String lastName = "Wesołowska";
        int age = 26;
        displayName3(firstName);
        displayName3(firstName, lastName);
        displayName3(firstName, lastName, age);



        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        int a = 1;
        int b = 2;
        int c = 3;
        int sumaA = computeSum(a,b);
        int sumaB = computeSum(a,b,c);

        System.out.println("Suma wywołań obu metod: " + computeSum(a,b) + " + " + computeSum(a,b,c));

    }

   public static int[] boardCompletion1(int[] tab1) {
        int j = 0;
        for (int i = 40; i >= 20; i--) {
            tab1[j] = i;
            System.out.print(tab1[j] + " ");
            j++;
            if (j > tab1.length)
                break;
        }
    return tab1;
}
    public static void displayArray1(int[] tab1) {
        for(int i = 0; i < tab1.length; i++)
        System.out.print(tab1[i] + " ");
    }

    public static String[] boardCompletion2(String[] tab2){
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        for (int i = 0; i < tab2.length; i++){
            System.out.println("Podaj słowo nr " + a + ", zatwierdź enterem");
            tab2[i] = scanner.nextLine();
            a++;
        }
        return tab2;
    }

    public static void displayArray2(String[] tab2) {
        System.out.println("Wyświetlanie podanych słów w odwrotnej kolejności: ");
        for (int i = tab2.length-1; i >= 0 ; i--) {
            System.out.println(tab2[i]);
        }
    }

    public static void displayName3 (String firstName){
        System.out.println("Podane imię: " + firstName);
    }
    public static void displayName3 (String firstName, String lastName){
        System.out.println("Podane imię: " + firstName + ", podane nazwisko: " + lastName);
    }
    public static void displayName3 (String firstName, String lastName, int age){
        System.out.println("Podane imię: " + firstName + ", podane nazwisko: " + lastName + ", wiek: " + age);
    }

    public static int computeSum(int a, int b){
        return a+b;
    }
    public static int computeSum(int a, int b, int c){
        return a+b+c;
    }
}
