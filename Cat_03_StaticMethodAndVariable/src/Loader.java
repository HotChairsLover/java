
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();
        Cat masha = new Cat();
        Cat igor = new Cat();

        System.out.println(Cat.getCount());

        System.out.println("Vasya weight: " + vasya.getWeight());
        vasya.feed(15000.0);
        masha.feed(15000.0);
        System.out.println("Vasya weight after feed: " + vasya.getWeight());
        System.out.println("Food amount: " + vasya.getFoodAmount());



        System.out.println("Vasya weight after pee " + vasya.getWeight());
        System.out.println(Cat.getCount());
        System.out.println(vasya.getStatus());
        System.out.println(masha.getStatus());

    }
}