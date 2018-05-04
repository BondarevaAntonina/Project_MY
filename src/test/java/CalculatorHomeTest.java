import for_test.Calculator;
import for_test.CalculatorOperation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by antoni on 25.04.2018.
 */

@RunWith(MockitoJUnitRunner.class)

public class CalculatorHomeTest {

    @Mock
    CalculatorOperation mockCalculatorOperation;

    @Spy
    CalculatorOperation calculatorOperation;

    @Test
    public void shouldReturnSumValues() {
        CalculatorOperation mockCalculator = Mockito.mock(CalculatorOperation.class);
        Mockito.when(mockCalculatorOperation.getAnotherValue()).thenReturn(10);
        Mockito.when(mockCalculator.sum(5, 8)).thenReturn(10);
        calculatorOperation.sum(9, 7);
        Mockito.verify(calculatorOperation, Mockito.times(2)).getAnotherValue();
//        Assert.assertEquals(16, mockCalculator.sum(7, 7));

    }

}
