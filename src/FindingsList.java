import java.util.*;

public class FindingsList {
    //public static void FindingsList() throws InterruptedException {
        public static void main(String[] args) throws InterruptedException {

        Thread.sleep(500);

        System.out.println("Welcome back!");

        ArrayList<String> rockList = new ArrayList<>();

        System.out.println("Rock data was downloaded successfully.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("The last one in the list was not a rock, so we need to remove that one from the list.");

        rockList.remove("not rock");

        System.out.println(rockList);

        System.out.println("Perfect");

        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data was downloaded successfully.");

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about? (Select from: Bird, fish, or tooth)?");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nFossil Description: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nFossil Description: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nFossil Description: " + fossilDirectory.get(fossilChoice));
        }

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Teleporter");
        supplies.add("Stun gun");
        supplies.add("Insta-Heal Capsules");

        supplies.remove("Stun gun");

        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
