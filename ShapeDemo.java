import java.util.Scanner;

// Abstract class
abstract class Shape {
    int dim1, dim2;

    // Constructor
    Shape(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    // Abstract method
    abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class
class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class
class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0); // dim2 is unused
    }

    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Shape rect = new Rectangle(l, b);
        rect.printArea();

        // Triangle
        System.out.print("Enter base and height of triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        Shape tri = new Triangle(base, height);
        tri.printArea();

        // Circle
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        Shape cir = new Circle(r);
        cir.printArea();

        sc.close();
    }
}