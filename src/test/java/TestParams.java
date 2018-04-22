import for_test.Calculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestParams {

    @Test
    @Parameters({"5|8", "6|9"})
    public void shouldPassParams(int valueOne, int valueTwo) {
        Calculator calculator = new Calculator();

        Assert.assertEquals(valueOne + valueTwo, calculator.sumParams(valueOne, valueTwo));
    }
}
