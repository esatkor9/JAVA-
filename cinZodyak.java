import java.util.Scanner;
public class cinZodyak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumYili , deger  ;



        System.out.print("Doğum Yılınızı Giriniz :");
        dogumYili = input.nextInt();
        deger = (dogumYili%12);


        if (dogumYili!=0){
        switch (deger) {
            case 0:

                System.out.println("Çin Zodyağı Burcunuz : maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz : horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz : fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz : öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz : kaplan");
                break;

            case 7:
                System.out.println("Çin Zodyağı Burcunuz : tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz : ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz : yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz : at");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz : koyun");
                break;
             }
        }else
            System.out.print("Htalı dğum tarihi girmsiniz");





















    }

}
