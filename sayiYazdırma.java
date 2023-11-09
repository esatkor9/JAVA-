import java.util.Scanner;

public class sayiYazdırma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, sayi;
        System.out.println("sayi giriniz =");
        sayi = input.nextInt();

        while (i < sayi) {
            i++;
            if (i % 2 != 0) {
                continue;
            }

            System.out.println(i);

        }


    }
}