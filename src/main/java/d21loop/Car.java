package d21loop;

public class Car extends Vehicle {

/*Constructor Hiyerarsisi- Child class’tan bir object olusturdugunuzda constructor’lar
    en ustteki parent class’tan baslatilarak alta doğru calistirilir*/

    //Constructor olusturalim

    public String model = "Accord";
    public int year = 2024;


    public Car() {

 this("Sport");
        System.out.println("Sedan");
    }

    public  Car (String tip){
        super();
        System.out.println("Sport");


    }
}
