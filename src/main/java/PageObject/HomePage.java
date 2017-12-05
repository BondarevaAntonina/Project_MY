package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by antoni on 05.12.2017.
 */
public class HomePage {
    private EventFiringWebDriver driver;
    private static final Logger LOGGER =  LoggerFactory.getLogger(HomePage.class);



    @FindBy(xpath =".//a[@href='https://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/'] " )
    private WebElement smartElectronic;

    @FindBy(xpath =".//a[contains(@href,'http://rozetka.com.ua/portativnaya-ehlektronika/c4627865/')] " )
    private WebElement portElectronic;


}
