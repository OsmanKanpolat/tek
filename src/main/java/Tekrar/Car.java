package Tekrar;

public class Car extends Vehicle {
   public String model ="Volvo";
    public int year =2025;


    public Car() {
       this("Sport");
        System.out.println("Sedan");


    }
    public Car(String tip){
        super("Honda ",2024,"Elektrikli");
        System.out.println("Sport");
    }
}
