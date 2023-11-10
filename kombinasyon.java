import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r;
        System.out.print("N sayısını giriniz = ");
        n = scan.nextInt();
        System.out.print("R sayısını giriniz = ");
        r = scan.nextInt();


        int faktoriyelN = 1, faktoriyelR = 1, faktoriyelA = 1;

        int i = 1;
        // n faktoriyel bulma
        while (i <= n) {
            faktoriyelN *= i;
            i++;
        }

        // r faktoriye bulma
        i=1;
        while (i <= r) {
            faktoriyelR *= i;
            i++;
        }

        // n-r faktoriyel bulma
        i=1;
        int a = (n - r);
        while (i <= a) {
            faktoriyelA *= i;
            i++;
        }

        //Kombinasyon formülü
        int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelA);

        System.out.print("C(n,r) = " + kombinasyon);

    }
}