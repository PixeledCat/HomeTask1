import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskN5 {

    public static List<String> findShortestString() {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        int minLength = 100000;


        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
            if (list.get(i).length() < minLength) minLength = list.get(i).length();
        }

        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() == minLength) result.add(list.get(i));
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(findShortestString().toArray()));

    }


}

