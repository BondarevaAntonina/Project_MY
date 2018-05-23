import for_test.Calculator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UsingRules {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

//    @Test(expected = NullPointerException.class)
    @Test
    public void shouldThrowException() {
        Calculator calculator = new Calculator();

        exception.expect(NullPointerException.class);

        exception.expectMessage("I'm NPE");

        calculator.throwException();
    }
}
