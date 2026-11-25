public class Square extends Rectangle {
    public Square(int sideLength) {
        super(sideLength, sideLength);
    }

    public Square() {
        this(4);
    }

    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    public void setWidth(int width) {
        super.setWidth(width);
        super.setLength(width);

    }

    public String toString() {
        return super.toString() + " This shape is a square.";
    }

}
