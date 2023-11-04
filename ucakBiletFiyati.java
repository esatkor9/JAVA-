import java.util.Scanner;

public class ucakBiletFiyati {
    public static void main(String[] args) {
        int KM, yas, tip;
        double normalTutar, toplamTutar, tekYonInd, gidisDonusInd, yasInd, indirimliTutar;
        Scanner input = new Scanner(System.in);

        //Kullanıcı veri Girşi

        System.out.print("Mesafeyi km türünden giriniz : ");
        KM = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        tip = input.nextInt();

        normalTutar = (0.10 * KM);

        if (KM >= 0 && yas >= 0) {
            if (tip == 1 || tip == 2) {
                if (tip == 2) {
                    if (yas < 12) {
                        yasInd = (normalTutar * 0.5);
                        indirimliTutar = normalTutar - yasInd;
                        gidisDonusInd = indirimliTutar * 0.2;
                        toplamTutar = (indirimliTutar - gidisDonusInd)*2;
                        System.out.println("Toplam Tutar = " + toplamTutar + " TL");
                    } else if (yas >= 12 && yas < 24) {
                        yasInd = (normalTutar * 0.1);
                        indirimliTutar = normalTutar - yasInd;
                        gidisDonusInd = indirimliTutar * 0.2;
                        toplamTutar = (indirimliTutar - gidisDonusInd)*2;
                        System.out.println("Toplam Tutar = " + toplamTutar + " TL");
                    } else if (yas > 65) {
                        yasInd = (normalTutar * 0.3);
                        indirimliTutar = normalTutar - yasInd;
                        gidisDonusInd = indirimliTutar * 0.2;
                        toplamTutar = (indirimliTutar - gidisDonusInd)*2;
                        System.out.println("Toplam Tutar = " + toplamTutar + " TL");
                    }

                } else if (tip == 1) {
                    System.out.println("Toplam Tutar = " + normalTutar + " TL");
                }
            } else
                System.out.println("Hatalı Veri Girdiniz !");
        } else
            System.out.println("Hatalı Veri Girdiniz !");

    }
}
