import for_test.Calculator;
import for_test.CalculatorOperation;
import org.junit.runner.RunWith;
import org.mockito.Mock;
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




}
