package javaapplication23;

public class TestShape {
    public static void main(String[] args) {
        Object shape01 = new Circle(10);
        Object shape02 = new Rectangle(10 , 20);
        Object shape03 = new Circle(10);
        Object shape04 = new Rectangle(10 , 20);
        System.out.println(shape01.toString());
        System.out.println(shape02.toString());
        
        Circle temp = (Circle)shape01;
        System.out.println(temp.getArea());
        System.out.println("shape01 = shape03?" + " " + shape01.equals(shape03));
        System.out.println("shape02 = shape04?" + " " + shape02.equals(shape04));
    } 
}
