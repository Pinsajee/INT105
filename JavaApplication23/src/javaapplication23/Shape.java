package javaapplication23;
public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "\tColor: " + color;
    }
    
    
    
}