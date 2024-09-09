package P0061;

public class Triangle {
    protected int side_A;
    protected int side_B;
    protected int side_C;
    protected float perimeter_Triangle;
    protected double Area_Triangle;

    public Triangle(int side_A, int side_B, int side_C, float perimeter_Triangle, double area_Triangle) {
        this.side_A = side_A;
        this.side_B = side_B;
        this.side_C = side_C;
        this.perimeter_Triangle = perimeter_Triangle;
        this.Area_Triangle = area_Triangle;
    }

    public int getSide_A() {
        return side_A;
    }

    public void setSide_A(int side_A) {
        this.side_A = side_A;
    }

    public int getSide_B() {
        return side_B;
    }

    public void setSide_B(int side_B) {
        this.side_B = side_B;
    }

    public int getSide_C() {
        return side_C;
    }

    public void setSide_C(int side_C) {
        this.side_C = side_C;
    }

    public float getPerimeter_Triangle() {
        return perimeter_Triangle = side_A + side_B + side_C;
    }

    public void setPerimeter_Triangle(float perimeter_Triangle) {
        this.perimeter_Triangle = perimeter_Triangle;
    }

    public double getArea_Triangle() {
        return Area_Triangle = Math.sqrt((perimeter_Triangle / 2) * (perimeter_Triangle - side_A) * (perimeter_Triangle - side_B) * (perimeter_Triangle - side_C));
    }

    public void setArea_Triangle(double area_Triangle) {
        Area_Triangle = area_Triangle;
    }
}
