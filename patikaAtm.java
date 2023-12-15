import java.util.Scanner;

public class patikaAtm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;
        int price;
        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz :");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz :");
            password = input.nextLine();

            if (userName.equals("Esat.Kor") && password.equals("Esatgs123")) {
                System.out.println("Sisteme giriş yaptınız");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {

                        case 1:
                            System.out.println("Para Miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para Miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz");
                            } else
                                balance -= price;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }

                } while (select != 4);
                System.out.print("Tekrar görüşmek üzere");
                break;
            } else {
                right--;
                System.out.println("hatalı giri, yaptınız tekrar deneyiniz.");
                if (right == 0) {
                    System.out.print("Hesabınız bloke omuştur lütfen banka ile iletişime geçiniz");
                } else
                    System.out.print("kalan giriş hakkınız :" + right);
            }


        }
    }
}
