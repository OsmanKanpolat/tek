package d6If_swich;

public class Car {
    // 1 variables

    String brand = "toyata";
    String model = "corolla";
    int year = 2024;
    boolean hybrid = true;

    // 2. method olusturma
    public void ac() {

        System.out.println(brand + "aracımız hızlıdır");
    }

    public void dc() {

        System.out.println(brand + "güvenli");
    }

    //Access Modifier + Class ismi + () + {}

    public Car(String brand, String model, int year, boolean hybrid) {

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(String brand, String model) {

        this.brand = brand;
        this.model = model;
    }

    public Car(int year, boolean hybrid) {

        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}


