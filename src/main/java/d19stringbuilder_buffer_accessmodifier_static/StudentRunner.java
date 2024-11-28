package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {

    public static void main(String[] args) {
//Student Class'tan bir instance olusturalim


    Student ali = new Student();
        System.out.println(ali.stdName);
        System.out.println(ali.email);
        System.out.println(ali.address);


        //System.out.println(ali.tcKimlik);//tcKimlik'e baska class'tan ulasilmaz cunku private


        System.out.println(ali);




    }
}
