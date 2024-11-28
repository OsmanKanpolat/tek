package d6If_swich;

public class CarRunner {

    public static void main(String[] args) {

      Car c = new Car("volvo","s60",2025,true);
        System.out.println(c.brand);
        System.out.println(c.model);
        System.out.println(c.year);
        System.out.println(c.hybrid);

        c.ac();
        c.dc();

        Car c1 = new Car("kıa","rio",2021,false);
        System.out.println(c);
        System.out.println(c1);



    }
}
