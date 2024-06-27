import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int [] numbers11To20={11,12,13,14,15,16,17,18,19,20};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Array "+numbers[6]);
        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("sum of numbers "+sum);

        int largestNumber = numbers[0];
        for (int number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        System.out.println("largest number is "+largestNumber);

        if(numbers.length !=numbers11To20.length){
            System.out.println("The array lengths do not match");
        }
        int[] array3= new int[numbers.length];
        for(int i=0;i<array3.length;i++){
            array3[i]=numbers[i]+numbers11To20[i];
        }

        System.out.println(Arrays.toString(array3));
    }
}
