package d6If_swich;

public class Switch01 {
    public static void main(String[] args) {
//“switch” Statement
//switch ifadesi, farklı koşullara dayalı olarak farklı eylemler gerçekleştirmek için kullanılır.
//if -else if’in yaptigini yapar. Okumasi ve yazmasi daha kolaydir.
//genel kullanimda, 3'ten fazla durum varsa switch kullaniriz.(best practise)

      /*Ornek 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
Sunday==>1  . . .  Saturday==>7

1.Yol : if - else if*/

        String dayName = "salı";
        if (dayName.equalsIgnoreCase("pazartesi")) {
            System.out.println("1");
        } else if (dayName.equalsIgnoreCase("salı")) {
            System.out.println("2");
        } else if (dayName.equalsIgnoreCase("çarşamba")) {
            System.out.println("3");

        } else if (dayName.equalsIgnoreCase("persembe")) {
            System.out.println("4");

        } else if (dayName.equalsIgnoreCase("cuma")) {
            System.out.println("5");
        } else if (dayName.equalsIgnoreCase("cumartesi")) {
            System.out.println("6");
        } else if (dayName.equalsIgnoreCase("pazar")) {
            System.out.println("7");
        } else {
            System.out.println("lütfen geçerli gün ismi giriniz");


            //2.yol----------
            switch (dayName) {
                case "Sunday":
                    System.out.println(1);
                    break;
                case "Monday":
                    System.out.println(2);
                    break;
                case "Tuesday":
                    System.out.println(3);
                    break;
                case "Wednesday":
                    System.out.println(4);
                    break;
                case "Thursday":
                    System.out.println(5);
                    break;
                case "Friday":
                    System.out.println(6);
                    break;
                case "Saturday":
                    System.out.println(7);
                    break;
                default:
                    System.out.println("Gecerli bir gun ismi giriniz");


            }
        }
    }
}

