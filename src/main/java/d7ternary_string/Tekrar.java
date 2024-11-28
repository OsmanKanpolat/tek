package d7ternary_string;

public class Tekrar {

    public static void main(String[] args) {


        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.

//Example 1: Write the code that calculates the absolute value of a number.

//-4 ==> -1*-4, 4 ==> 4, 0 ==> 0

        int n = 8 ;

        int num = (n < 0 ) ? (-1*n) : (n) ;
        System.out.println(num);

        //----------------------

        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
// “Farkli isaretli sayilari carpamiyorum” mesaji veren kodu yaziniz.

        int a = 5;
        int b = 7;

        Object ab = (a < 0 && b < 0) || (a > 0 && b > 0) ? (a * b) : ("Farkli isaretli sayilari carpamiyorum" ) ;
        System.out.println(ab);

        //---------------

        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.

        int d = 123 ;
        a = Math.abs(a);

        String üç = (d > 99 && d < 1000)  ? "üç basamaklıdır."  : "üç basamaklı degil.";
        System.out.println(üç);
    }
}
