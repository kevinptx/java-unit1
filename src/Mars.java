public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "SpaceX";
        int shipPopulation = 300;
        double meals = 4000.0;
        boolean landing = true;
        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;
        String landingLocation = "The Hill";
        if (landingLocation.equalsIgnoreCase("The Ocean.")){
            System.out.println("Bbzzz Landing on the Ocean.");
        }
        else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Ocean.");
        }
        landing = landingCheck(100);
    }

    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        int i = 0;
        for (int minute = 0; minute <= minutesLeft; i++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
