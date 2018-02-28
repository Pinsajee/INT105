package javaapplication23;

public class Rectangle extends Shape implements ColorAble {

    private double width;
    private double high;
    private String color;

    public Rectangle(double width, double high) {
        super("White");
        this.width = width;
        this.high = high;
    }

    public Rectangle(String color, double width, double high) {
        super("White");
        this.width = width;
        this.high = high;
    }

    public double getArea() {
        return this.high * this.width;
    }

    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && obj instanceof Rectangle) {
            Rectangle temp = ((Rectangle) obj);
            if (this.high == temp.high) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle " + " Width: " + width + "\t " + "High: " + high + "\t" + "Area: " + "\t" + this.getArea() + "\t" + super.toString();

    }

    @Override
    public double getPerimeter() {
        return 2 * (this.high + this.width);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void fillColor(String color) {
        this.color = color;
    }

}
