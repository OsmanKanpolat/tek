package B292_DTpractice;

import java.util.Scanner;

public class C07_ifStatements {

    public static void main(String[] args) {


        // Soru 1) Kullanicidan 100 uzerinden notunu isteyin.
// Not'u harf sistemine cevirip yazdirin.
// 50’den kucukse "D",
// =50  <60 arasi "C",
// =60  <80 arasi "B",
// =80’nin uzerinde ise "A"


        //1. adım scanner objesi olusturmak
        Scanner input=new Scanner(System.in);

        //2. adım kullanıcıdan bilgi almak icin kullanıcıya bilgi vermek
        System.out.println("Lütfen 100 üzerinden notunuzu giriniz");

        //3. adım kullanıcının girdiği değeri bir kavanoza almak
        float not= input.nextFloat();//float aldık çünkü not ondalıklı olabilir ve double'a nazaran daha az yer kaplar!!!

        if (not < 0) {
            System.out.println("lütfen 100 üzerinden geçerli bir sayı giriniz.");

        } else if (not < 50) {
            System.out.println("D");

        } else if (not < 60) {
            System.out.println("C");

        } else if (not < 80) {
            System.out.println("B");

        } else if ( not > 80 && not < 100) {
            System.out.println("A");

        } else {
            System.out.println("tanımlamamış not");
        }
    }
}
