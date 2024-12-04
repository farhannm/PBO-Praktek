interface DrawAPI {
    void drawCircle(int radius, int x, int y);
  }
  
  // Concrete Implementors
  class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Red Circle [radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
  }
  
  class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Green Circle [radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
  }
  
  // Abstraction
  abstract class Shape {
    protected DrawAPI drawAPI;
  
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
  
    public abstract void draw();
  }
  
  // Refined Abstraction
  class Circle extends Shape {
    private int x, y, radius;
  
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
  
    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
  }
  
  // Main
  public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 20, 30, new RedCircle());
        Shape greenCircle = new Circle(15, 25, 35, new GreenCircle());
  
        redCircle.draw();
        greenCircle.draw();
    }
  }