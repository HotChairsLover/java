
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();

        System.out.println("Vasya weight: " + vasya.getWeight());
        vasya.feed(150.0);
        System.out.println("Vasya weight after feed: " + vasya.getWeight());
        System.out.println("Food amount: " + vasya.getFoodAmount());

        for(int i = 0; i < 10; i++){
            vasya.pee();
        }

        System.out.println("Vasya weight after pee " + vasya.getWeight());
    }
}