import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil, artikYil, artikYil1;

        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();


        if (yil > 0) {
            artikYil = yil % 4;
            artikYil1 = yil % 400;

            if (artikYil1 == 0) {
                System.out.print(yil + " bir artık yıldır !");
            } else if (artikYil == 0) {
                System.out.print(yil + " bir artık yıldır !");
            }else
                System.out.print(yil + " bir artık yıl değildir !");


        } else
            System.out.println("Hatalı  yıl girdiniz");


    }
}
