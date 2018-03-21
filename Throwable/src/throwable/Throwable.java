package throwable;

public class Throwable {

    public static void main(String[] args) {
        try {
            System.out.println(5 / 1);
            int[] number = {1, 2, 3, 4, 5};
            System.out.println(number[5]);
        } catch (RuntimeException object) {
            System.out.println("I can catch you");
            System.out.println(object.getStackTrace());
            object.printStackTrace();
        }
    }
}
