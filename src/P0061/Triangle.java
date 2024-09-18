package P0061;

public class Triangle extends Shape{
    private double side_A;
    private double side_B;
    private double side_C;

    public Triangle(double side_A, double side_B, double side_C) {
        this.side_A = side_A;
        this.side_B = side_B;
        this.side_C = side_C;
    }

    @Override
    public double getPerimeter() {
        return side_A + side_B + side_C;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side_A) * (s - side_B) * (s - side_C));
    }

    @Override
    public void printResult() {
        System.out.println("Triangle:");
        System.out.println("Side A: " + side_A);
        System.out.println("Side B: " + side_B);
        System.out.println("Side C: " + side_C);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
