public class Cheetah extends Animal {
    private int numClaws;
    private int numTeeth;
    private String color;
    private double weight;
    private double size;
    private String funFact;
    private String distinctiveFeature;

    public Cheetah() {
        super("Cheetah",1.4);
        this.numClaws = 18;
        this.numTeeth = 30;
        this.color = "Golden with black spots";
        this.weight = 50.0;
        this.size = 1.4;
        this.funFact = "Cheetahs are the fastest land animals.";
        this.distinctiveFeature = "Spots and tear-like streaks on their face.";
    }

    public String getDetails() {
        return "Cheetah Details:\n" +
               "Claws: " + numClaws + "\n" +
               "Teeth: " + numTeeth + "\n" +
               "Color: " + color + "\n" +
               "Weight: " + weight + " kg\n" +
               "Size: " + size + " meters\n" +
               "Fun Fact: " + funFact + "\n" +
               "Distinctive Feature: " + distinctiveFeature;
    }
}
