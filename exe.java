abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double area();

    @Override
    public String toString() {
        return "Shape color is " + color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color); // Calling Shape constructor
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + " and area is " + area();
    }
}

public class exe {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", 5.0);
        System.out.println(circle.toString());
    }
}