import java.util.Scanner;
public class etkinlikOneri {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sicaklik;

    System.out.print("Lütfen sıcaklık derecesini giriniz = ");
        sicaklik = input.nextInt();

        if (sicaklik < 5){
            System.out.print("Kayak yapanilirsiniz");
        } else if (sicaklik >= 10 && sicaklik <= 15) {
            System.out.print("pikniğe ve sinemaya gidebilirsiniz");
        } else if (sicaklik > 5 && sicaklik < 15 ){
            System.out.print("sinemaya gidebilirsiniz");
        } else if (sicaklik > 10 && sicaklik < 20) {
            System.out.print("piknik gidebilirsiniz");
        } else if (sicaklik > 25) {
            System.out.println("Yüzmeye gidebilirsiniz");
        }


    }
}