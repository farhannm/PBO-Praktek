// Prototype Interface
interface Prototype extends Cloneable {
    Prototype clone();
}

// Concrete Prototype
class Shape implements Prototype {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    @Override
    public Prototype clone() {
        return new Shape(this.type);
    }

    @Override
    public String toString() {
        return "Shape [type=" + type + "]";
    }
}

// Main
public class PrototypePatternDemo {
    public static void main(String[] args) {
        Shape original = new Shape("Circle");
        Shape cloned = (Shape) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);
    }
}
