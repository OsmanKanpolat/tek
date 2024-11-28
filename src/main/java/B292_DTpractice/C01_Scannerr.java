package B292_DTpractice;

import java.util.Scanner;

public class C01_Scannerr {

    public static void main(String[] args) {

        //Kullanicidan yaricap isteyip cemberin cevresini ve
//dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
//(pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)


        Scanner input = new Scanner(System.in);

        System.out.printf("lütfen yarı çapı giriniz.");
        double yarıÇap = input.nextDouble();

        System.out.println("dairenin alanı :" + (3*yarıÇap*yarıÇap) );
        System.out.println("dairenin çevresi :" + (2*3*yarıÇap));


        System.out.println("Çevre = " + 2*Math.PI*yarıÇap);
        System.out.println("Alan = "+Math.PI*(Math.pow(yarıÇap,2)));
        //Math classı java icerisindeki matematik ile ilgili işlemlerin yetersiz oldugu durumlarda kullanılan matematik classıdır!!!
        //Math.pow(r,2);//r²
        //System.out.println("Math.PI = " + Math.PI);

        System.out.println("Çevre = " + String.format("%.2f",2*Math.PI*yarıÇap));
        System.out.println("Alan = "+String.format("%.2f",Math.PI*(Math.pow(yarıÇap,2))));
    }
}
