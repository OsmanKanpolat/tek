package d23oop_collections;

public class AudiS5 implements Engine , AC ,Brake {

    @Override
    public void turbo() {
        System.out.println("AudiS5 nin turbo yüksektir");
    }

    @Override
    public void gas() {
        System.out.println("AudiS5 ningas yüksektir");
    }

    @Override
    public void eco() {
        System.out.println("AudiS5 nin ecoyüksektir");
    }

    @Override
    public void run() {
        System.out.println("AudiS5 nin run yüksektir");
    }

    @Override
    public void analog() {
        System.out.println("AudiS5 nin turbo yüksektir");
    }

    @Override
    public void dijital() {
        System.out.println("AudiS5 nin turbo yüksektir");
    }

    @Override
    public void abs() {

    }

    @Override
    public void esp() {

    }
}
