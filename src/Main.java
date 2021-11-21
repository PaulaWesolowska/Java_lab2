public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        // a) użyć break
        for (int i = 100; i >= 0; i--) {
            if (i == 17)
                break;
            System.out.print(i + " ");
        }
        System.out.println("\n");
        // b) w drugiej pętli continue
        for (int j = 50; j >= 10; j--) {
            if (j % 5 == 0)
                continue;
            System.out.print(j + " ");
        }
        System.out.println("\n");
        // c) użyć return
        for (int i = 100; i > 0; i--) {
            if (i == 47)
                return;
            System.out.print(i + " ");
        }
    }
}
