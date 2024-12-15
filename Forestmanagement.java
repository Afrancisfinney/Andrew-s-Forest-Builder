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
