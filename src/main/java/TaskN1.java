import java.util.Arrays;

class TaskN1 {

    private static int[] array = new int[10];

    public static int[] fillArray() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 2 * i + 1;
            //can cout like this
            //System.out.print(array[i] + ", ");
        }
        return arr;
    }

    public static void main(String[] args) {

        array = fillArray();

        System.out.println(Arrays.toString(array));

    }

}