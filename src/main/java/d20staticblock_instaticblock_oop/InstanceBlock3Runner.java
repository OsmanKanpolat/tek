package d20staticblock_instaticblock_oop;

public class InstanceBlock3Runner {

    public static void main(String[] args) {

        InstanceBlock3 car1 = new InstanceBlock3();
        InstanceBlock3 car2 = new InstanceBlock3();

        //Bir veya daha cok object(instance) daha uretsem, o da siyah ve benzin olur

        //Ancak constructor'larla ozellestirilebilir

        //Ancak constructor'larla ozellestirilebilir


        InstanceBlock3 car3 = new InstanceBlock3("beyaz","dizel");
        System.out.println("Araba rengi: " + car3.color); //Araba rengi: Kirmizi
        System.out.println("Araba yakit turu: " + car3.fuelType); //Araba yakit turu: Dizel

        InstanceBlock3 car4 = new InstanceBlock3();
        //Araba rengi: Siyah
        //Araba yakit turu: Benzin
    }
}
