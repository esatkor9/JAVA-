import java.util.Scanner;

public class sad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, i = 1, j = 1;

        System.out.print("sayi gir = ");
        number = scan.nextInt();

        while (i <=number) {
            System.out.print(i + ",");
            i*=4;
        }
        System.out.println("\n------------------------------");
        while (j <= number){
            System.out.print(j + ",");
        j*=5;
        }


    }

}
