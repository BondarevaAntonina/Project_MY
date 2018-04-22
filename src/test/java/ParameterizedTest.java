import for_test.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    @Parameterized.Parameter(value = 1)
    public int valueOne;

    @Parameterized.Parameter
    public int valueTwo;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{5, 6}, {8, 9}};

        return Arrays.asList(data);
    }

    @Test
    public void shoudSumValues() {
        Calculator calculator = new Calculator();

        System.out.println(valueOne + "\t" + valueTwo);

        Assert.assertEquals(valueOne + valueTwo, calculator.sumParams(valueOne, valueTwo));
    }
}
