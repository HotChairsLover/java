
public class Cat
{
    private double originWeight;
    private double weight;

    private static final double MIN_WEIGHT = 1000;
    private static final double MAX_WEIGHT = 9000;

    private double foodAmount;

    private static int count;
    private int originCount;

    private CatColors catColor;

    private String catName;

    private static final int EYES_COUNT = 2;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
        originCount++;

    }

    public Cat(double weight, String catName, CatColors catColor)
    {
        this.weight = weight;
        this.catName = catName;
        this.catColor = catColor;
        originWeight = weight;
        count++;
        originCount++;
    }

    public Cat(Cat text)
    {
        this(text.getWeight(),text.getCatName(),text.getCatColor());
    }


    public Cat(double weight)
    {
        this();
        originWeight = weight;
        this.weight = weight;
    }

    public void setCatName(String name)
    {
        catName = name;
    }

    public String getCatName()
    {
        return catName;
    }

    public void setСatColor(CatColors type)
    {
        catColor = type;
    }

    public CatColors getCatColor()
    {
        return catColor;
    }

    public double getFoodAmount()
    {
      foodAmount = weight - originWeight;
      return foodAmount;
    }

    public static int getCount()
    {
        return Cat.count;
    }


    public void pee()
    {
        if(weight >= 1000 && weight <= 9000) {
            weight = weight - 500;
            System.out.println("Cat is pissing");
        }
        if(weight < 1000 && count >= 0 && count <= originCount) {
            count--;
        }
    }

    public void meow()
    {
        if(weight >= 1000 && weight <= 9000) {
            weight = weight - 1;
            System.out.println("Meow");
        }
        if(weight < 1000) {
            count--;
        }
    }

    public void feed(Double amount)
    {
        if(weight >= 1000 && weight <= 9000) {
            weight = weight + amount;
        }
        if(weight > 9000) {
            count--;
        }

    }

    public void drink(Double amount)
    {
        if(weight >= 1000 && weight <= 9000) {
            weight = weight + amount;
        }
        if(weight > 9000) {
            count--;
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}