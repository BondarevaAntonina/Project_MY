import for_test.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    Calculator mockCalculator;

    @Spy
    Calculator calculator;

    @Test
    public void shouldReturnSumValues() {
        Calculator calculator1 = new Calculator();

//        Calculator mockCalculator = Mockito.mock(Calculator.class);

//        Mockito.when(mockCalculator.sum(5, 8)).thenReturn(10);

//        Mockito.when(mockCalculator.sum(5, 8)).thenCallRealMethod();

//        Mockito.when(mockCalculator.getValue()).thenCallRealMethod();
//        Mockito.when(mockCalculator.getValue()).thenReturn(10);
//        Mockito.when(mockCalculator.getValue()).thenCallRealMethod();

//        Assert.assertEquals(23, mockCalculator.sum(5, 8));

        calculator.sum(5, 8);

        Mockito.verify(calculator, Mockito.times(3)).getAnotherValue();
    }

    @Test
    public void trySpy() {
//        Mockito.when(calculator.getValue()).thenReturn(10);

        Assert.assertEquals(25, calculator.sum(7, 8));
    }
}
