
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double foodAmount;

    private static int count;
    private int originCount;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
        originCount++;

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
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
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