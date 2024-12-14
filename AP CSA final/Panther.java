public class Panther extends Animal {
    private int numClaws;
    private int numTeeth;
    private String color;
    private double weight;
    private double size; 
    private String funFact;
    private String distinctiveFeature;

    public Panther(){
        super("Panther",1.8); 
        this.numClaws = 18;
        this.numTeeth = 30;
        this.color = "Black";
        this.weight = 70.0;
        this.size = 1.8;
        this.funFact = "Panthers are leopards or jaguars with melanistic coloration.";
        this.distinctiveFeature = "Sleek black fur for camouflage";
    }

    public String getDetails() {
        return "Panther Details:\n" +
               "Claws: " + numClaws + "\n" +
               "Teeth: " + numTeeth + "\n" +
               "Color: " + color + "\n" +
               "Weight: " + weight + " kg\n" +
               "Size: " + size + " meters\n" +
               "Fun Fact: " + funFact + "\n" +
               "Distinctive Feature: " + distinctiveFeature;
    }
}
