package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by antoni on 05.12.2017.
 */
public class HomePage extends AbstractPageObject {
    private EventFiringWebDriver driver;
    private static final Logger LOGGER =  LoggerFactory.getLogger(HomePage.class);



    @FindBy(name =".//a[@data-title='Смартфоны, ТВ и электроника'] " )
    private WebElement smartElectronic;

    @FindBy(xpath =".//a[contains(.,'Портативная электроника')] " )
    private WebElement portElectronic;

    @FindBy(xpath =".//a[contains(.,'Наушники')] " )
    private WebElement naushnici;

    public HomePage(EventFiringWebDriver driver) {
        super(driver);
    }


}
