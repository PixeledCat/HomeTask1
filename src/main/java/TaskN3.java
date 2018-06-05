import arrays.pckg.ArrayManager;

import java.util.List;
import java.util.Scanner;

public class TaskN3 {


    public static float getAverage(String s) {

        List<Integer> array = ArrayManager.fillArray(s);

        int size = array.size(),
                elementsSum = 0;

        for (int element : array) {
            elementsSum += element;
        }

        return (float) elementsSum / size;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getAverage(scanner.nextLine()));

    }

}
