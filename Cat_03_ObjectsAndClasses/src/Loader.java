
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();
        Cat murka = new Cat();
        Cat kesha = new Cat();
        Cat pushok = new Cat();
        Cat timur = new Cat();

        System.out.println("Vasya weight: " + vasya.getWeight());
        System.out.println("Murka weight: " + murka.getWeight());
        System.out.println("Kesha weight: " + kesha.getWeight());
        System.out.println("Pushok weight: " + pushok.getWeight());
        System.out.println("Timur weight: " + timur.getWeight());

        vasya.feed(8000.0);
        while (murka.getStatus() != "Dead") {
            murka.meow();
        }

        System.out.println("Vasya is: " + vasya.getStatus());
        System.out.println("Murka is: " + murka.getStatus());



    }
}