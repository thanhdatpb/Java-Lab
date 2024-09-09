package P0061;

public class Circle {
    protected double radius;
    protected double perimeter_Circle;
    protected double Area_Circle;

    public Circle(double radius, double perimeter_Circle, double area_Circle) {
        this.radius = radius;
        this.perimeter_Circle = perimeter_Circle;
        Area_Circle = area_Circle;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter_Circle() {
        return perimeter_Circle  = 2 * radius * Math.PI;
    }

    public void setPerimeter_Circle(double perimeter_Circle) {
        this.perimeter_Circle = perimeter_Circle;
    }

    public double getArea_Circle() {
        return Area_Circle = radius * radius * Math.PI;
    }

    public void setArea_Circle(double area_Circle) {
        Area_Circle = area_Circle;
    }
}
