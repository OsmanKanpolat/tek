package d7ternary_string;

public class Ternary02 {

    public static void main(String[] args) {

        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.


        int a = 123;
        a = Math.abs(a);

        String result = (a > 99 && a < 1000) ? "Uc basamaklidir" : "Uc basamakli degildir";
        System.out.println(result);

    }
}
