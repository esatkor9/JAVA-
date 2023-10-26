import  java.util.Scanner;

public class parkUcretiHesaplama {
    public static void main(String[] args) {
        int sabit = 50 , time , timeUc ;
    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen NE KADAR SÜRE KALACAĞINIZI BELİRTİNİZ =  ");
        time = input.nextInt();

        if (time < 6) {
            timeUc = time * sabit;
            System.out.println(timeUc);
        }else{
            timeUc = (time * sabit)-sabit;
            System.out.println(timeUc);
        }

        System.out.println(" ");
        System.out.println("ücreti en geç yarın ödeyiniz ");


        if (timeUc > 300 ){
            System.out.print("Şubeye gitmeliz lazım");
        } else if ((timeUc < 300) && (timeUc > 100)) {
            System.out.println("Ödemenizi telefon üzerinden yapabilirsiniz");
        } else if (timeUc < 100 ) {
            System.out.println("Bugüne özel 100 tl altı ödemeler alınmayacaktır \niyi günler");
        }


    }
}
