package throwable;

public class Throwable {

    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException object) {
            System.out.println("I can catch you");
        }
    }

}
