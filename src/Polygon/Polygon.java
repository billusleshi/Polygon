package Polygon;

public class Polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle("Red", 5);
        circle.displayColor();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle("Blue", 4, 6);
        rectangle.displayColor();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle("Green", 3, 7);
        triangle.displayColor();
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

	}

}
