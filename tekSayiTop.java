import java.util.Scanner;

public class tekSayiTop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;

        do {
            System.out.print("Sayı gir =");
            sayi = input.nextInt();

            if (sayi % 2 == 1) {
                toplam += sayi;
            }

        } while (sayi > 0);
        System.out.println(toplam);
    }
}
