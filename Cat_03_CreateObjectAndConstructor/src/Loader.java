
public class Loader
{
    public static void main(String[] args)
    {
        getKitten();

    }

    private static void getKitten()
    {
        Cat vasya = new Cat(1100);
        System.out.println("Vasya weight is: " + vasya.getWeight());
        System.out.println("Vasya is: " + vasya.getStatus());

        Cat murka = new Cat(1100);
        System.out.println("Murka weight is: " + murka.getWeight());
        System.out.println("Murka is: " + murka.getStatus());

        Cat barsik = new Cat(1100);
        System.out.println("Barsik weight is: " + barsik.getWeight());
        System.out.println("Barsik is " + barsik.getStatus());
    }
}