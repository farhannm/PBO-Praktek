public class Circle2 extends Shape {
    private double radius;

    // No-arg constructor
    public Circle2() {
        super(); // Calls Shape's no-arg constructor
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle2(double radius) {
        super(); // Calls Shape's no-arg constructor
        this.radius = radius;
    }

    // Constructor with color and radius
    public Circle2(String color, boolean filled, double radius) {
        super(color, filled); // Calls Shape's constructor with color and filled
        this.radius = radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
