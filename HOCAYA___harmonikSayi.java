import java.util.Scanner;

public class HOCAYA___harmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" n sayısını giriniz  =");
        int n = input.nextInt();

        double toplam= 0;

        for (int i = 1 ; i <= n ; i++){
            toplam += (double) 1 / i ;
        }
        System.out.print(toplam);





    }
}
