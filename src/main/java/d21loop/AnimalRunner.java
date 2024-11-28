package d21loop;

public class AnimalRunner {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.bark();
        d.feedWithMilk();
        d.drink();// mammal
        d.eat();// amimals drink


        Cat c =new Cat();
        c.meow();
        c.feedWithMilk();
        c.drink();
        c.eat();

    }


}
