package d4operator_castıng_scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Ornek 3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen iki sayı giriniz.");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Addition : " + (firstNumber + secondNumber));
        System.out.println("Subtraction : " + String.format("%.2f",(firstNumber-secondNumber)));
        System.out.println("Multiplication : " + (firstNumber * secondNumber));
        System.out.println("Division : " + (firstNumber / secondNumber));


    }
}
