package d5increment_decrement_if;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {


      /*Ornek 6: Yeni Satir Karakteri ('\n') Hatasi: Ardışık olarak birden fazla Scanner objesiyle bilgi
toplarken bazı girdilerin atlanması, genellikle Scanner'ın girdi akışını nasıl işlediğiyle ilgilidir.
Bu durum, özellikle nextInt(), nextDouble() gibi sayısal girdi alan metodlardan sonra nextLine() metodunu
kullanırken yaygın olarak karşılaşılır.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen yasınızı giriniz.");//Sayisal bir input aldik
        int age = scanner.nextInt();

        scanner.nextLine();//Kullanilmayan yeni satir karakterini okuyup atar


        System.out.println("lütfen adınızı giriniz.");
        String name = scanner.next();//Calistirinca bu satir atlanacak





//Aciklama: Bu kodda, nextInt() çağrısından sonra nextLine() hemen çağrılır.
// Ancak, kullanıcının yaşını girdikten sonra Enter tuşuna basmasıyla oluşan
// yeni satır karakteri (\n) girdi akışında kalır. nextInt() yalnızca sayısal değeri okur
// ve yeni satır karakterini okumaz(akista kalir). Bu yüzden, program nextLine()’a ulaştığında,
// hâlâ okunmamış bir yeni satır karakteri bulur ve bunu boş bir satır olarak yorumlar,
// böylece kullanıcıdan adını almak için beklemeksizin hemen ilerler.

      /*Bu sorunu çözmenin yaygın bir yolu, sayısal girdi aldıktan sonra bir nextLine() çağrısı
ekleyerek kalan yeni satır karakterini temizlemektir*/

//ARASTIRMA ODEVI:Yeni Satir Karakteri ('\n') Hatasini duzeltmenin baska yollari var mi?



    }
}
