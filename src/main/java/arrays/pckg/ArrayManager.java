package arrays.pckg;

import java.util.ArrayList;
import java.util.List;

public class ArrayManager {

    public static List<Integer> fillArray(String parsable) {
        String[] elements;
        List<Integer> array = new ArrayList<>();
        elements = parsable.split(" ");

        for (String element : elements) {
            array.add(Integer.parseInt(element));
        }

        return array;
    }

}
