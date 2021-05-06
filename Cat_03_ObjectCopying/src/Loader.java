
public class Loader
{
    public static void main(String[] args)
    {
        Cat original = new Cat(80000, "Мурка" , CatColors.WHITE);

        System.out.println(original.getWeight());
        System.out.println(original.getStatus());
        System.out.println(original.getCatColor());
        System.out.println(original.getCatName());

        Cat clone = new Cat(original);

        System.out.println(clone.getWeight());
        System.out.println(clone.getStatus());
        System.out.println(clone.getCatColor());
        System.out.println(clone.getCatName());

        System.out.println(Cat.getCount());
    }
}