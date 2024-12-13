import java.util.ArrayList;

public class Animal {
    private String type; 
    private ArrayList<Animal> animals;

    public Animal(String type) {
        this.type = type;
        this.animals = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the forest.");
        } else {
            System.out.println("Animals in the forest:");
            for (Animal animal : animals) {
                System.out.println("- " + animal.getType());
            }
        }
    }
}
