import java.util.Scanner;

public class hesapMakinesiCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, secim;

        System.out.print("İlk sayıyı giriniz =");
        sayi1 = input.nextInt();
        ;
        System.out.print("İkinci sayıyı giriniz = ");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme 5-Moda alma");
        System.out.println("Yapmak istediğiniz işlemi seçin ?");
        secim = input.nextInt();


        switch (secim) {

            case 1:
                System.out.print("Toplam =" +(sayi1 + sayi2));
                break;
            case 2:
                System.out.print("Çıkarma =" + (sayi1 - sayi2));
                break;
            case 3:
                System.out.print("Çarpım = "+ (sayi1 * sayi2) );
                break;
            case 4:
                if (sayi2 != 0) {
                    System.out.println("Bölüm = "+ (sayi1 / sayi2) );
                }else
                    System.out.println("lütfen başka bir sayı giriniz");
                break;
            case 5:
                System.out.print("Modu ="+(sayi1 % sayi2));
                break;
        }


    }
}
