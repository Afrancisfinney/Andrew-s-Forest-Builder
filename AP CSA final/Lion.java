public class Lion extends Animal {
    private int numClaws;
    private int numTeeth;
    private String color;
    private double weight;
    private double size;
    private String funFact;
    private String distinctiveFeature;

    public Lion() {
        super("Lion");
        this.numClaws = 18;
        this.numTeeth = 30;
        this.color = "Golden";
        this.weight = 190.0;
        this.size = 2.5;
        this.funFact = "Lions live in groups called prides.";
        this.distinctiveFeature = "Mane on male lions.";
    }

    public String getDetails() {
        return "Lion Details:\n" +
               "Claws: " + numClaws + "\n" +
               "Teeth: " + numTeeth + "\n" +
               "Color: " + color + "\n" +
               "Weight: " + weight + " kg\n" +
               "Size: " + size + " meters\n" +
               "Fun Fact: " + funFact + "\n" +
               "Distinctive Feature: " + distinctiveFeature;
    }
}
