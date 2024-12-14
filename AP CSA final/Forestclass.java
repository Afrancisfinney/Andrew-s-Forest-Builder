import java.util.Scanner;

public class Forestclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Forest forest = new Forest(); 
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("Is the forest wet or dry?");
            String forestType = scanner.nextLine();

            if (forestType.equalsIgnoreCase("wet")) {
                System.out.println("Choose an animal: Panther or Tiger?");
                String animalChoice = scanner.nextLine();

                if (animalChoice.equalsIgnoreCase("Panther")) {
                    forest.addAnimal(new Panther());
                } else if (animalChoice.equalsIgnoreCase("Tiger")) {
                    forest.addAnimal(new Tiger());
                } else {
                    System.out.println("Invalid choice.");
                }
            } else if (forestType.equalsIgnoreCase("dry")) {
                System.out.println("Choose an animal: Lion or Cheetah?");
                String animalChoice = scanner.nextLine();

                if (animalChoice.equalsIgnoreCase("Lion")) {
                    forest.addAnimal(new Lion());
                } else if (animalChoice.equalsIgnoreCase("Cheetah")) {
                    forest.addAnimal(new Cheetah());
                } else {
                    System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("Invalid forest type.");
            }

            System.out.println("Do you want to add another animal? (yes/no)");
            String continueChoice = scanner.nextLine();
            if (continueChoice.equalsIgnoreCase("no")) {
                keepGoing = false;
            }
        }

        System.out.println("\n--- Summary of Animals in the Forest ---");
        forest.displayAnimals(); 

        scanner.close();
    }
}
