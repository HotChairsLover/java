import com.skillbox.airport.Airport;

public class Numbers
{
    public static void main(String[] args)
    {
        Airport airport = Airport.getInstance();

        System.out.println(airport.getTerminals());
        System.out.println(airport.getTerminals().stream().count());

        System.out.println(airport.getAllAircrafts());
        System.out.println(airport.getAllAircrafts().stream().count());

    }
}
