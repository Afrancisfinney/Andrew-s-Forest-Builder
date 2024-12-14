public class Tiger extends Animal {
    private int numClaws;
    private int numTeeth;
    private String color;
    private double weight;
    private double size;
    private String funFact;
    private String distinctiveFeature;

    public Tiger() {
        super("Tiger",2.9);
        this.numClaws = 18;
        this.numTeeth = 30;
        this.color = "Orange with black stripes";
        this.weight = 220.0;
        this.size = 2.9;
        this.funFact = "Tigers are excellent swimmers.";
        this.distinctiveFeature = "Stripes unique to each tiger.";
    }

    public String getDetails() {
        return "Tiger Details:\n" +
               "Claws: " + numClaws + "\n" +
               "Teeth: " + numTeeth + "\n" +
               "Color: " + color + "\n" +
               "Weight: " + weight + " kg\n" +
               "Size: " + size + " meters\n" +
               "Fun Fact: " + funFact + "\n" +
               "Distinctive Feature: " + distinctiveFeature;
    }
}
