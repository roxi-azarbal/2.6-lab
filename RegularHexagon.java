public class RegularHexagon extends Polygon {
    private double sideLength;

    public RegularHexagon(double sideLength) {
        super(6);
        this.sideLength = notNegative(sideLength);
    }

    public RegularHexagon() {
        this(1.0);
    }

    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
    }

    public String toString() {
        return super.toString()
                + " This is a regular hexagon. Its side length is " + sideLength;
    }
}
