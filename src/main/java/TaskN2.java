import arrays.pckg.ArrayManager;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskN2 {


    public static List<Integer> perform(String s) {

        List<Integer> array = ArrayManager.fillArray(s);

        int minIndex = 0,
                maxIndex = 0,
                minVal = array.get(0),  // so arrays like [5, 5, 5, 5] won`t cause any errors
                maxVal = array.get(0);

        //can`t handle arrays like [5, 5, 3, 0, 0]
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > array.get(maxIndex)) {
                maxIndex = i;
                maxVal = array.get(maxIndex);
            } else if (array.get(i) < array.get(minIndex)) {
                minIndex = i;
                minVal = array.get(minIndex);
            }

        }
        array.set(maxIndex, minVal);
        array.set(minIndex, maxVal);

        return array;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(perform(scanner.nextLine()).toArray()));

    }

}
