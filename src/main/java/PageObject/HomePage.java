package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by antoni on 05.12.2017.
 */

public class HomePage {
    private EventFiringWebDriver driver;
    private static final Logger LOGGER =  LoggerFactory.getLogger(HomePage.class);



    @FindBy(name =".//a[@data-title='Смартфоны, ТВ и электроника'] " )
    private WebElement SmartElectronic;

    @FindBy(xpath =".//a[contains(.,'Портативная электроника')] " )
    private WebElement PortElectronic;

    @FindBy(xpath =".//a[contains(.,'Наушники')] " )
    private WebElement Naushnici;

    public HomePage(EventFiringWebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver;
    }


    public  void goMenuClick (EventFiringWebDriver driver) throws  Exception {
         SmartElectronic.click();
    }



}




