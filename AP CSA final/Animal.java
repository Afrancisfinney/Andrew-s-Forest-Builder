public class Animal {
    private String type; 
    private double size; 

    public Animal(String type, double size) {
        this.type = type;
        this.size = size; 
    }

    public String getType() {
        return type;
    }

    public double getSize() {
        return size;
    }

    public String compareSize(Animal other) {
        if (this.size > other.size) {
            return this.getType() + " is larger than " + other.getType();
        } else if (this.size < other.size) {
            return other.getType() + " is larger than " + this.getType();
        } else {
            return this.getType() + " and " + other.getType() + " are the same size.";
        }
    }
}
