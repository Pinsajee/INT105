package javaapplication23;

public class Rectangle extends Shape {
    private double width;
    private double high;

    public Rectangle(double width, double high) {
        super("White");
        this.width = width;
        this.high = high;
    }
    
    
    public Rectangle(String color , double width , double high) {
        super(color);
        this.width = width;
        this.high = high;
    }
    public double getArea() {
        return this.high * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle " + " width: " + width + "\t high: "  + high + "\t area: " + this.getArea() + "\t" + super.toString();
    }
    
}
