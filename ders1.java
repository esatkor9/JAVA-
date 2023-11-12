import java.util.Scanner;

public class ders1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban, kuvvet;
        System.out.print("n sayısını giriniz = ");
        taban = input.nextInt();
        System.out.print("r sayısını giriniz = ");
        kuvvet = input.nextInt();

        int sonuc = 1;

        if (taban > 0) {

            for (int i = 1; i <= kuvvet; i++) {
                sonuc *= taban;
            }
            System.out.println(sonuc);
        } else
            System.out.print("Lütfe geçerli bir sayı giriniz");


    }
}

