import java.util.Arrays;

public class TaskN4 {


    public static void main(String[] args) {


        int[] array = new int[13];

        int num0 = 0,
                numPositive = 0,  //+1
                numNegative = 0;  //-1

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 3) - 1;
            if (array[i] == 0) {
                num0++;
                continue;
            }
            if (array[i] > 0) {
                numPositive++;
                continue;
            }
            numNegative++;
        }

        int max = Math.max(Math.max(num0, numNegative), numPositive);

        System.out.println(Arrays.toString(array));

        if (max == num0) System.out.println("Element: 0 ► " + max + " times!");
        if (max == numNegative) System.out.println("Element: -1 ► " + max + " times!");
        if (max == numPositive) System.out.println("Element: 1 ► " + max + " times!");
    }

}
