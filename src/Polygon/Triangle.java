package Polygon;
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculatePerimeter() {
        // Assuming it's a generic triangle without specifying sides.
        return 3 * base;
    }

    @Override
    public void displayColor() {
        System.out.println("Shape: Triangle");
        super.displayColor();
    }
}
