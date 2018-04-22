import for_test.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculator.class)
public class TryPowerMock {

    @Test
    public void shouldMockStaticMethod() {
        PowerMockito.mockStatic(Calculator.class);

        Mockito.when(Calculator.getStaticValue()).thenReturn(10);

        Assert.assertEquals(10, Calculator.getStaticValue());
    }

    @Test
    public void shouldMockPrivateMethod() throws Exception {
        Calculator calculator = new Calculator();

        Calculator spyCalc = PowerMockito.spy(calculator);

        PowerMockito.doReturn(5).when(spyCalc, "getValue");

        int sum = spyCalc.sum(8, 7);

        Assert.assertEquals(20, sum);
    }
}
