public abstract class Polygon {
    private int numberOfSides;

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public static double notNegative(double value) {
        if (value < 0) {
            value = 0;
        }
        return value;
    }

    public abstract double getArea();

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int sides) {
        numberOfSides = sides;
    }

    public String toString() {
        return "This is a Polygon.";
    }
}