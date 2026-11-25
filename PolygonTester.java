public class PolygonTester {
    public static void main(String[] args) {

        // TEST 02
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Sides (expect 4): " + rectangle.getNumberOfSides());
        System.out.println("Area (expect 15.0): " + rectangle.getArea());

        // TEST 03
        System.out.println(
                "toString (expect \"This shape is a rectangle with a length of 5"
                        + "and a width of 3. It's area is 15.0\"): "
                        + rectangle.toString());

        // TEST 04
        Square square = new Square(3);
        System.out.println("Sides (expect 4): " + square.getNumberOfSides());
        System.out.println("Area (expect 9.0): " + square.getArea());

        // TEST 05
        System.out.println(
                "toString (expect \"This shape is a square with a length of 3"
                        + "and a width of 3. It's area is 9.0\"): "
                        + square.toString());

        // TEST 06
        Triangle triangle = new Triangle(6, 4);
        System.out.println("Sides (expect 3): " + triangle.getNumberOfSides());
        System.out.println("Area (expect 12.0): " + triangle.getArea());

        // TEST 07
        System.out.println(
                "toString (expect \"This shape is a triangle with a base of 6"
                        + "and a height of 4. It's area is 12.0\"): "
                        + triangle.toString());
        // STRETCH
        System.out.println("toString (expect true): " + new Rectangle(4, 4).isSquare());

        RegularHexagon regularHex = new RegularHexagon(2.0);
        System.out.println("Sides (expect 6): " + regularHex.getNumberOfSides());
        System.out.println("Area (expect 10.3923): " + rectangle.getArea());
    }
}