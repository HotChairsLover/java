package core;

public class Car {
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;


    public void settNumber(String number)
    {
        this.number = number;
    }

    public String gettNumber()
    {
        return number;
    }

    public void settHeight(int height)
    {
        this.height = height;
    }

    public int gettHeight()
    {
        return height;
    }

    public void settWeight(double weight)
    {
        this.weight = weight;
    }

    public double gettWeight()
    {
        return weight;
    }

    public void settHasVehicle(boolean trueOrFalse)
    {
        this.hasVehicle = trueOrFalse;
    }

    public boolean gettHasVehicle()
    {
        return hasVehicle;
    }

    public void settIsSpecial(boolean trueOrFalse)
    {
        this.isSpecial = trueOrFalse;
    }

    public boolean gettIsSpecial()
    {
        return isSpecial;
    }



    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}