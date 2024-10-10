public class TestShapes {
    public static void main(String[] args) {
        // Test Shape
        Shape shape = new Shape();
        System.out.println(shape); // A Shape with color of green and filled

        // Test Circle
        Circle2 circle = new Circle2(5.0);
        System.out.println(circle); // A Circle with radius=5.0, which is a subclass of A Shape with color of green and filled
        System.out.println("Area: " + circle.getArea()); // Area of the circle
        System.out.println("Perimeter: " + circle.getPerimeter()); // Perimeter of the circle

        // Test Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println(rectangle); // A Rectangle with width=4.0 and length=6.0, which is a subclass of A Shape with color of green and filled
        System.out.println("Area: " + rectangle.getArea()); // Area of the rectangle
        System.out.println("Perimeter: " + rectangle.getPerimeter()); // Perimeter of the rectangle

        // Test Square
        Square square = new Square(3.0);
        System.out.println(square); // A Square with side=3.0, which is a subclass of A Rectangle with width=3.0 and length=3.0, which is a subclass of A Shape with color of green and filled
        System.out.println("Area: " + square.getArea()); // Area of the square
        System.out.println("Perimeter: " + square.getPerimeter()); // Perimeter of the square
    }
}
