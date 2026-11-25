public class Rectangle extends Polygon {
    private double length;
    private double width;

    public Rectangle(int length, int width) {
        super(4);
        this.length = notNegative(length);
        this.width = notNegative(width);
    }

    public Rectangle() {
        this(4, 3);
    }

    public void setLength(int length) {
        this.length = notNegative(length);
    }

    public void setWidth(int width) {
        this.width = notNegative(width);
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + " This shape is a rectangle with a length of "
                + length + " and a width of " + width
                + ". It's area is " + getArea() + ".";
    }

    // stretch:
    public boolean isSquare() {
        if (length == width) {
            return true;
        }
        return false;
    }

}
