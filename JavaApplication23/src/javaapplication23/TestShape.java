package javaapplication23;

public class TestShape {
    public static void main(String[] args) {
        Shape shape01 = new Circle(10);
        Shape shape02 = new Rectangle(10 , 20);
        System.out.println(shape01.toString());
        System.out.println(shape02.toString());
    } 
}
