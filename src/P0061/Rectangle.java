package P0061;

public class Rectangle {
    protected int width;
    protected int length;
    protected float perimeter_Rectangle;
    protected float Area_Rectangle;


    public Rectangle(int width, int length,float perimeter_Rectangle,float Area_Rectangle) {
        this.width = width;
        this.length = length;
        this.perimeter_Rectangle = perimeter_Rectangle;
        this.Area_Rectangle = Area_Rectangle;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getPerimeter_Rectangle() {
        return perimeter_Rectangle = (width + length) * 2;
    }

    public void setPerimeter_Recrangle(float perimeter_Rectangle) {
        this.perimeter_Rectangle = perimeter_Rectangle;
    }

    public float getArea_Rectangle() {
        return Area_Rectangle = width * length;
    }

    public void setArea_Rectangle(float area_Rectangle) {
        Area_Rectangle = area_Rectangle;
    }
}
