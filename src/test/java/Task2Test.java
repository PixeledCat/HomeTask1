import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class Task2Test {

    @Test
    public void testReplacementWhenAllElementsAreTheSame() { // :)
        List<Integer> testArray;
        testArray = TaskN2.perform("5 5 5 5");
        int[] expected = {5, 5, 5, 5};

        Assert.assertEquals(Arrays.toString(testArray.toArray()), Arrays.toString(expected));
    }

    @Test
    public void testReplacement() {
        List<Integer> testArray;
        testArray = TaskN2.perform("3 10 5 0");
        int[] expected = {3, 0, 5, 10};

        Assert.assertEquals(Arrays.toString(testArray.toArray()), Arrays.toString(expected));
    }

}
