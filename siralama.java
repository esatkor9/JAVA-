import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, max, min, ort;

        System.out.println("Sayı 1, 2 ve 3 giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a > b && a > c) {
            max = a;
            if (b > c) {
                ort = b;
                min = c;
            } else {
                ort = c;
                min = b;
            }
        } else if (b > a && b > c) {
            max = b;
            if (a > c) {
                ort = a;
                min = c;
            } else {
                ort = c;
                min = a;
            }
        } else {
            max = c;
            if (b > a) {
                ort = b;
                min = a;
            } else {
                ort = a;
                min = b;
            }
        }

        System.out.println(min + " < " + ort + " < " + max);
    }
}
