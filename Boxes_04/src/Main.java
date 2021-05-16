public class Main {
    public static void main(String[] args) {
        trucksCount(125451);

    }

    public static void trucksCount(double boxCount) {
        int trucks = 0;
        int containers = 0;
        int boxes;
        int containersCount = 0;
        int boxNumbers = 0;

        while (boxCount > 0) {
            trucks++;
            System.out.println("Грузовик " + trucks + ":");
            for (containers = 1; containers <= 12 & boxCount > 0; containers++) {
                if (boxCount <= 0) {
                    return;
                }
                containersCount++;
                System.out.println("Контейнер " + containers + ":");
                for (boxes = 1; boxes <= 27 & boxCount > 0; boxes++) {
                    boxNumbers++;
                    System.out.println("\tЯщик " + boxNumbers);
                    boxCount--;
                }
            }
        }
        System.out.println("Необходимо: ");
        System.out.println("Грузовиков - " + trucks);
        System.out.println("Контейнеров - " + containersCount);
    }
}

