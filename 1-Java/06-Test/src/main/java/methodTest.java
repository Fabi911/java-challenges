public class methodTest {
    public static void main(String[] args) {
        System.out.println(add(5,8));
        System.out.println(isEven(6));
        System.out.println(multiply(5,6));
        System.out.println(toUpperCase("hello"));
        System.out.println(isPositive(5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }
}
