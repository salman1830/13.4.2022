package javaapplication21;

public class JavaApplication21 {

    public static void main(String[] args) {
        try {
            int d = 0;
            int n = 20;
            int fraction = n / d;
            int g[] = {1};
            g[20] = 100;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
        } finally {
            System.out.printf("Finnaly");
        }
        System.out.println("End Of Main");

    }
}
