public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius)
    {
        double circleSquare = Math.PI * Math.pow( radius, 2);
        return circleSquare;
    }


    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius)
    {
        double sphereVolume = 4 * Math.PI * Math.pow(radius , 2);
        return sphereVolume;
    }

    public static boolean isTriangleRightAngled(double a, double b, double c)
    {
        if(a + b > c & a + c > b & b + c > a)
        {
            return true;
        }
        else {
            return false;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c)
    {
        if(a + b > c & a + c > b & b + c > a) {
            double p = ((a + b + c) / 2);
            double triangleSquare = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return triangleSquare;
        }
        else {
            return 0;
        }
    }
}
