package javaapplication23;
public class Circle extends Shape {
    private double radius;


    public Circle(String color , double radius) {
        super(color);
        this.radius = radius;
    }
    
    public Circle(double radius) {
        super("White");
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    

    @Override
    public String toString() {
        return "Circle " + "Radius: " + radius + "\t" + "Area: " + this.getArea() + super.toString();
    }
    
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && obj instanceof Circle) {
            if (this.radius == ((Circle) obj).getRadius()) {
                result = true;
            }
        }
        return result;
    }
    

    }
