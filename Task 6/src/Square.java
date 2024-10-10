public class Square extends Rectangle {
    // Constructor with side
    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }

    // Override setLength and setWidth to maintain square geometry
    @Override
    public void setLength(double length) {
        super.setWidth(length); // Set both width and length to maintain square geometry
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width); // Set both length and width to maintain square geometry
    }
}
