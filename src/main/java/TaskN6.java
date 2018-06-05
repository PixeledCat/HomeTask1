import arrays.pckg.ArrayManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskN6 {

    public static List<Integer> removeRepeatingElements() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        List<Integer> array;


        while (true) {
            array = ArrayManager.fillArray(scanner.nextLine());
            if (array.size() >= 3) break;
        }

        for (int element : array) {
            if (!result.contains(element)) result.add(element);
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeRepeatingElements().toArray()));

    }


}

