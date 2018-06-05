import org.junit.Assert;
import org.junit.Test;


public class Task1Test {

    @Test
    public void TestArrayFiller() {
        int[] testArray;
        testArray = TaskN1.fillArray();
        for (int element : testArray) {
            Assert.assertTrue(element % 2 != 0);
        }
    }

}
