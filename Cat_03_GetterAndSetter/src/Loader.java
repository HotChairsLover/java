
public class Loader
{
    public static void main(String[] args)
    {
        getKitten();

    }

    private static void getKitten()
    {
        Cat vasya = new Cat();
        vasya.setСatColor(CatColors.WHITE);
        System.out.println("Vasya color is: " + vasya.getCatColor());
        System.out.println("Vasya weight is: " + vasya.getWeight());
        System.out.println("Vasya is: " + vasya.getStatus());

        Cat murka = new Cat();
        murka.setСatColor(CatColors.BLACK);
        System.out.println("Murka color is: " + murka.getCatColor());
        System.out.println("Murka weight is: " + murka.getWeight());
        System.out.println("Murka is: " + murka.getStatus());

        Cat barsik = new Cat();
        barsik.setСatColor(CatColors.BLACK);
        System.out.println("Barsik color is: " + barsik.getCatColor());
        System.out.println("Barsik weight is: " + barsik.getWeight());
        System.out.println("Barsik is " + barsik.getStatus());
    }
}