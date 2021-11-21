import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

        ArrayList<String> list1 = new ArrayList<>();
        setAnimals(list1);
        getAnimals(list1);
        sortAnimals(list1);
        getAnimals(list1);

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        Set<Integer> numbers = new TreeSet<>();
        setNumber(numbers);
        sortNumbers(numbers);
        getNumbers(numbers);


    }

    public static void setAnimals(List<String> list1){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++){
            System.out.println("Podaj zwierzę: ");
            String animal = scanner.nextLine();
            list1.add(animal);
        }
    }
    public static void getAnimals(List<String> list1){
        System.out.println("\nPodane zwierzęta: ");
        for(String zmienna : list1){
            System.out.println(zmienna);
        }
    }

    public static void sortAnimals(List<String> list1){
        Collections.sort(list1, Collections.reverseOrder());
    }

    public static void setNumber(Set<Integer> numbers){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println("Podaj liczbę: ");
            int nr = scanner.nextInt();
            numbers.add(nr);
        }
    }
    public static void sortNumbers(Set<Integer> numbers){
        Iterator<Integer> i = numbers.iterator();
        while(i.hasNext()){
            i.next();
        }
    }
    public static void getNumbers(Set<Integer> numbers){
        System.out.println("\nPodane liczby: ");
        for(Integer z : numbers){
            System.out.println(z);
        }
    }
}
