package Homework16;

public class Shape {
    //1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code
    double radius;
    Shape(double radius){

        this.radius=radius;
    }
}
class Circle extends Shape {
    double pi;

    Circle(int radius, double pi) {
        super(radius);
        this.pi = pi;

    }

  double calculateArea() {
        double area = (pi * (radius * radius));
        return area;
    }

}
