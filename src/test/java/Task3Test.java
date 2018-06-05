import org.junit.Assert;
import org.junit.Test;

public class Task3Test {

    @Test
    public void getAverageWhenAllElementsAreZero() { // :)
        float actual = TaskN3.getAverage("0 0 0 0");
        Assert.assertTrue(actual == 0f);
    }

    @Test
    public void getAverage() { // :)
        float actual = TaskN3.getAverage("10 5");
        Assert.assertTrue(actual == 7.5f);
    }

}
