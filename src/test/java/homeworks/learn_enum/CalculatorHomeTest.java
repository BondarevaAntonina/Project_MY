package homeworks.learn_enum;

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

        Mockito.when(mockCalculatorOperation.getValueOne()).thenReturn(10);

        Mockito.when(mockCalculatorOperation.getValueTwo()).thenReturn(10);

        Mockito.when(mockCalculatorOperation.sum()).thenCallRealMethod();

        Assert.assertEquals(20, mockCalculatorOperation.sum());

        Mockito.verify(mockCalculatorOperation, Mockito.times(1)).getValueOne();

        Mockito.verify(mockCalculatorOperation, Mockito.times(1)).getValueTwo();

    }

}
