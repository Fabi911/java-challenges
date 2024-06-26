public class addMethod {

    public static void main(String[] args) {
        System.out.println("add: "+ add(3,4));
        System.out.println("add: "+ add(3.5,4.5));
        System.out.println("subtract: "+ subtract(3,4));
        System.out.println("subtract: "+ subtract(3.8,2.6));
        System.out.println("makePositive: "+ makePositive(3,4));
        System.out.println("isABigger: "+ isABigger(3,4));
        System.out.println("isABigger: "+ isABigger(4,2));
        System.out.println("oddNumberCheck: "+oddNumberCheck(4));
        System.out.println("oddNumberCheck: "+oddNumberCheck(7));
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("car"));
        System.out.println(isPalindrome("racecar"));

    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static int makePositive(int a, int b) {
        return Math.abs(subtract(a, b));}

    public static int isABigger(int a, int b) {
        if (a > b) {
            return subtract(a, b);
        } else {
            return add(a, b);
        }
    }

    public static int oddNumberCheck(int number) {
        if (number % 2 == 0) {
            return number;
        } else {
            return number * 2;
        }
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
