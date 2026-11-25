public class Triangle extends Polygon {
    private double base;
    private double height;

    public Triangle(int base, int height) {
        super(3);
        this.base = notNegative(base);
    }

    public Triangle() {
        this(3, 4);
    }

    public void setBase(int base) {
        this.base = notNegative(base);
    }

    public void setHeight(int height) {
        this.height = notNegative(height);
    }

    public double getArea() {
        return (base * height) / 2.0;
    }

    public String toString() {
        return super.toString() + " This is a triangle. The base is " + base
                + " and the height is " + height
                + ". The area is " + getArea() + ".";
    }

}
