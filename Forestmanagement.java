import java.util.ArrayList;

public class Forestmanagement {
    private ArrayList<Animal> animals; 

    public Forestmanagement() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the forest.");
        } else {
            System.out.println("Animals in the forest:");
            for (Animal animal : animals) {
                System.out.println("- " + animal.getType()); 
            }
    
            System.out.println("\n--- Animal Details ---");
            for (Animal animal : animals) {
                if (animal instanceof Lion) {
                    System.out.println(((Lion) animal).getDetails());
                } else if (animal instanceof Panther) {
                    System.out.println(((Panther) animal).getDetails());
                } else if (animal instanceof Tiger) {
                    System.out.println(((Tiger) animal).getDetails());
                } else if (animal instanceof Cheetah) {
                    System.out.println(((Cheetah) animal).getDetails());
                }
            }
    
            System.out.println("\n--- Animal Size Comparisons ---");
            if (animals.size() == 1) {
                System.out.println("There is only one animal in the forest.");
            } else {
                for (int i = 0; i < animals.size() - 1; i++) {
                    for (int j = i + 1; j < animals.size(); j++) {
                        Animal animal1 = animals.get(i);
                        Animal animal2 = animals.get(j);
                        System.out.println(animal1.compareSize(animal2));
                    }
                }
            }
        }
    }
    
    
    
    
}
