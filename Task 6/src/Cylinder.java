/**
 * The Cylinder class models a cylinder that is a subclass of Circle.
 * It inherits the radius and color from the Circle class and adds a height attribute.
 */
public class Cylinder extends Circle{
    // Private instance variable
    private double height;

    // Constructors (overloaded)
    /** Constructs a Cylinder instance with default radius, color, and height */
    public Cylinder() {
        super();  // Call the default constructor of Circle (radius=1.0, color="red")
        this.height = 1.0;  // Default height
    }

    /** Constructs a Cylinder instance with the given height and default radius and color */
    public Cylinder(double height) {
        super();  // Default radius=1.0, color="red"
        this.height = height;
    }

    /** Constructs a Cylinder instance with the given radius and height, and default color */
    public Cylinder(double radius, double height) {
        super(radius);  // Call the constructor of Circle with given radius and default color
        this.height = height;
    }

    /** Constructs a Cylinder instance with the given radius, height, and color */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);  // Call the constructor of Circle with radius and color
        this.height = height;
    }

    // Getter and Setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Task 1.2 : Override getArea to calculate the surface area of the cylinder
    @Override
    public double getArea() {
        // Surface Area = 2πrh + 2πr² (2 * π * radius * height + 2 * base area)
        double baseArea = super.getArea();  // Calls Circle's getArea()
        double surfaceArea = 2 * Math.PI * getRadius() * height + 2 * baseArea;
        return surfaceArea;
    }


    /** Returns the volume of the cylinder */
    // public double getVolume() {
    //     return getArea() * height;  // getArea() is inherited from the Circle class
    // }

    // Task 1.2 : Use Circle's getArea for base area calculation in getVolume
    public double getVolume() {
        return super.getArea() * height;  // Volume = base area * height
    }

    /** Returns a self-descriptive string of this instance in the form of
     * Cylinder[radius=?, height=?, color=?]
     */
    // @Override
    // public String toString() {
    //     return "Cylinder[radius=" + getRadius() + ", height=" + height + ", color=" + getColor() + "]";
    // }

    // Task 1.3 : Override toString() to include height and reference to Circle's toString()
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
