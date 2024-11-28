package d4operator_castıng_scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Ornek 4: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz

        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen dikdörtgenin kısa kenar uzunluğunu giriniz.");
        float kısa = input.nextFloat();
        System.out.println("lütfen dikdörtgenin uzun kenar uzunluğunu giriniz.");
        float uzun = input.nextFloat();

        System.out.println("Area : " + (kısa * uzun));
        System.out.println("Perimeter : " + (2 * kısa + 2 * uzun));

    }
}
