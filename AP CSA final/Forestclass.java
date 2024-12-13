import java.util.Scanner;

public class Forestclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal forest = new Animal("Forest");
        boolean keepGoing = true;
                System.out.println("Welcome To Andrew's Forest Builder");
        while (keepGoing) {
            System.out.println("Is your animal a rainforest animal or a desert animal? (rainforest/desert)");
            String forestType = scanner.nextLine();

            if (forestType.equalsIgnoreCase("rainforest")) {
                System.out.println("Choose an animal: Panther or Tiger?");
                String animalChoice = scanner.nextLine();

                if (animalChoice.equalsIgnoreCase("Panther")) {
                    Panther panther = new Panther();
                    forest.addAnimal(panther);
                    System.out.println(panther.getDetails());
                } else if (animalChoice.equalsIgnoreCase("Tiger")) {
                    Tiger tiger = new Tiger();
                    forest.addAnimal(tiger);
                    System.out.println(tiger.getDetails());
                } else {
                    System.out.println("Invalid choice.");
                }
            } else if (forestType.equalsIgnoreCase("desert")) {
                System.out.println("Choose an animal: Lion or Cheetah?");
                String animalChoice = scanner.nextLine();

                if (animalChoice.equalsIgnoreCase("Lion")) {
                    Lion lion = new Lion();
                    forest.addAnimal(lion);
                    System.out.println(lion.getDetails());
                } else if (animalChoice.equalsIgnoreCase("Cheetah")) {
                    Cheetah cheetah = new Cheetah();
                    forest.addAnimal(cheetah);
                    System.out.println(cheetah.getDetails());
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
