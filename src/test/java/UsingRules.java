import for_test.Calculator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class UsingRules {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    @Rule
    public final SystemOutRule outRule = new SystemOutRule().enableLog();

    //    @Test(expected = NullPointerException.class)
    @Test
    public void shouldThrowException() {
        Calculator calculator = new Calculator();

        exception.expect(NullPointerException.class);

        exception.expectMessage("I'm NPE");

        calculator.throwException();
    }

    @Test
    public void useTemporaryFolder() throws IOException {
        File file = folder.newFile("Hello.txt");

        File file1 = folder.newFolder("Tonya", "Video");

        System.out.println();
    }

    @Test
    public void useSystemOutRule() throws IOException {
       System.out.println("Hello, Tonya");

        String log = outRule.getLog();

        Assert.assertTrue(log.contains("Hello, Tonya"));
    }
}
