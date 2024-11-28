package Tekrar;

public class Student {


    public  String name ="Emre Hakan Osman";
   protected String adress = "Hollanda";
   String email ="osman@gmail.com";
   private String tc = "122345668677" ;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", tc='" + tc + '\'' +
                '}';
    }
}
