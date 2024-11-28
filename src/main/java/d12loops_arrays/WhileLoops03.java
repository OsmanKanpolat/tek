package d12loops_arrays;

public class WhileLoops03 {

    public static void main(String[] args) {

        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
//Example 1: Write the code to check if a given integer is a palindrome.
//           Palindrome: 121 <==> 121        123321 <==> 123321


        int k = 312;

        String orıgınal = String.valueOf(k);
        String reversed = "";


        int index = orıgınal.length() - 1; //son index'i elde ettik

        while (index >= 0) {
            reversed = reversed + orıgınal.charAt(index);
            index--;
        }
        System.out.println(reversed); //"213"


        if (orıgınal.equals(reversed)) {
            System.out.println("Palindromdur");
        } else {
            System.out.println("Palindrom degildir");

        }
    }
}
