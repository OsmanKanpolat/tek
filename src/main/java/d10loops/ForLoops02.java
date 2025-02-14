package d10loops;

public class ForLoops02 {

    public static void main(String[] args) {

        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdirini */

        //charAt() methoduna index verince size karakteri getirir.
//break keyword’u, bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır.

        String s = "Tramvay";


        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a') {

                break;
            }

            System.out.print(ch);
        }


        //Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz.
        //"Pwd12?Ab" ==> P12?A


        String s1 = "Pwd12?Ab";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                continue; //geri kalan kodlari yurutme, artirma azaltmaya git

            } else {
                System.out.print(ch); //P12?A


                //----------------------interview - is gorusmesi sorusu
                //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz.
                //example 3: Write the code that reverses a given String

                //           String t = "Ali Can";  ==> “naC ilA”
                //Loop olustururken baslangic ve bitis degeri cok onemlidir

                //son index her zaman length()-1’tir

                System.out.println();

                String t = "Java";
                String reverse = "";  //ters cevirince bunun icinde saklayacagiz

                for (int a = t.length() - 1;     a >= 0 ; a--) {

                    reverse = reverse + t.charAt(a);

                }
                System.out.println(reverse);


            }
        }
    }
}