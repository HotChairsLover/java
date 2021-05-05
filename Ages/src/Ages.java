public class Ages
{
    public static void main(String[] args)
    {
       int vasyaAge = 25;
       int sashaAge = 574;
       int anyaAge = 4;
       int dimaAge = 5678;
       int sergeyAge = 46;

       var ages = new int[] {vasyaAge, sashaAge, anyaAge, dimaAge, sergeyAge};

       var minAge = ages[0];
       for (int num : ages) {
           if (num < minAge) {
               minAge = num;
           }
       }
        System.out.println(minAge);

       var middleAge = ages[0];
       if (ages.length > 0) {
           var sum = 0;
           for (int i = 0; i < ages.length; i++) {
               sum += ages[i];
           }
           middleAge = sum / ages.length;
       }
        System.out.println(middleAge);

       var maxAge = ages[0];
       for (int num : ages)
       {
           if (num > maxAge)
           {
               maxAge = num;
           }
       }
        System.out.println(maxAge);
    }
}
