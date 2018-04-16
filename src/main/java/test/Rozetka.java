package test;

import helper.BaseFunction;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by antoni on 12.01.2018.
 */
public class Rozetka {
    private EventFiringWebDriver driver;
    private static final Logger LOGGER = LoggerFactory.getLogger(Rozetka.class);
    static EventFiringWebDriver eventDriver;


    @BeforeClass
    public static void beforeAll() throws IOException {

        eventDriver = BaseFunction.getDriver();

    }

    @Test
    public void Headphones() throws Exception {
        LOGGER.info("Поиск  подменю нашников");

/* transition */


    }
}
